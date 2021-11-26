package com.zuplae.repository;

import javax.persistence.EntityManager;


public abstract class BaseRespository<T> {

    private EntityManager entityManager;

    public BaseRespository() {
        this.entityManager = new ConnectionFactory().getConnection();     
    }

    public void create(T model){
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(model);        
        this.entityManager.getTransaction().commit();
    }
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void update(T model){
        this.getEntityManager().getTransaction().begin();
        this.getEntityManager().merge(model);        
        this.getEntityManager().getTransaction().commit();
    }
   
}
