package com.zuplae.repository;

import java.util.List;
import javax.persistence.EntityManager;

import com.zuplae.model.ContaCorrente;

public class ContaCorrenteRepository  extends BaseRespository<ContaCorrente>{
    private EntityManager entityManager;

    public List<ContaCorrente> read(){
        return this.entityManager
            .createQuery("SELECT cc FROM ContaCorrente cc", ContaCorrente.class)
            .getResultList();
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
