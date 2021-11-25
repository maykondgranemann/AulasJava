package com.zuplae.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    private EntityManager entityManager;
    
    public ConnectionFactory() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.entityManager = factory.createEntityManager();
    }

    public EntityManager getConnection(){
        return entityManager;
    }
}
