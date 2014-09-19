/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modelo.Marca;
import util.JPAUtil;

/**
 *
 * @author gledson.cruz
 */
public class MarcaDao implements Dao<Marca, Serializable> {

    @Override
    public void salvar(Marca obj) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void alterar(Marca obj) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void excluir(Marca obj) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Marca marca = em.merge(obj);
            em.remove(marca);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public Marca carregarPorId(Integer id) {
        EntityManager em = JPAUtil.getEntityManager();
        Marca marca = null;
        try {
            marca = em.find(Marca.class, id);
        } finally {
            em.close();
        }
        return marca;
    }

    @Override
    public List<Marca> carregarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query q = em.createQuery("select a from Marca a", Marca.class);
            List<Marca> marcas = q.getResultList();
            return marcas;
        } finally {
            em.close();
        }

    }

    public List<Marca> carregarPorNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();        
         try {
            Query q = em.createQuery("select a from Marca a where a.nome like :nome");
            q.setParameter("nome", nome + "%");
            List<Marca> marcas = q.getResultList();
            return marcas;
        } finally {
            em.close();
        }

    }

}
