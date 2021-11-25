package com.zuplae.dao;

import java.util.List;
import javax.persistence.EntityManager;

import com.zuplae.model.ContaCorrente;

public class ContaCorrenteDao {
    private EntityManager entityManager;

    public ContaCorrenteDao() {
        this.entityManager = new ConnectionFactory().getConnection();     
    }

    public int create(ContaCorrente model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);        
        this.entityManager.getTransaction().commit();
        return model.getId();
    }

    public List<ContaCorrente> read(){
        return this.entityManager
            .createQuery("SELECT cc FROM ContaCorrente cc", ContaCorrente.class)
            .getResultList();
    }

    public void update(ContaCorrente model){
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(model);        
        this.entityManager.getTransaction().commit();
    }
    public void delete(int id){
        ContaCorrente model = this.entityManager.find(ContaCorrente.class, id);
        if(model != null){
            this.entityManager.getTransaction().begin();
            this.entityManager.remove(model);        
            this.entityManager.getTransaction().commit();
        }        
    }
}
