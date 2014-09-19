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
import modelo.Modelo;
import util.JPAUtil;

/**
 *
 * @author gledson.cruz
 */
public class ModeloDao implements Dao<Modelo, Serializable> {

    @Override
    public void salvar(Modelo obj) {
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
    public void alterar(Modelo obj) {
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
    public void excluir(Modelo obj) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Modelo modelo = em.merge(obj);
            em.remove(modelo);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public Modelo carregarPorId(Integer id) {
        EntityManager em = JPAUtil.getEntityManager();
        Modelo modelo = null;
        try {
            modelo = em.find(Modelo.class, id);
        } finally {
            em.close();
        }
        return modelo;
    }

    @Override
    public List<Modelo> carregarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query q = em.createQuery("select a from Modelo a", Modelo.class);
            List<Modelo> modelos = q.getResultList();
            return modelos;
        } finally {
            em.close();
        }
    }
    
    public List<Modelo> carregarPorDescricao(String descricao) {
        EntityManager em = JPAUtil.getEntityManager();        
         try {
            Query q = em.createQuery("select a from Modelo a where a.descricao like :descricao");
            q.setParameter("descricao", descricao + "%");
            List<Modelo> modelos = q.getResultList();
            return modelos;
        } finally {
            em.close();
        }

    }

}
