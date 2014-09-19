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
import modelo.Automovel;
import util.JPAUtil;

/**
 *
 * @author gledson.cruz
 */
public class AutomovelDao implements Dao<Automovel, Serializable> {

    @Override
    public void salvar(Automovel obj) {
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
    public void alterar(Automovel obj) {
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
    public void excluir(Automovel obj) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Automovel auto = em.merge(obj);
            em.remove(auto);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public Automovel carregarPorId(Integer id) {
        EntityManager em = JPAUtil.getEntityManager();
        Automovel auto = null;
        try {
            auto = em.find(Automovel.class, id);
        } finally {
            em.close();
        }
        return auto;
    }

    @Override
    public List<Automovel> carregarTodos() {
        EntityManager em = JPAUtil.getEntityManager();

        Query q = em.createQuery("select a from Automovel a", Automovel.class);
        List<Automovel> autos = q.getResultList();
        return autos;

    }

}
