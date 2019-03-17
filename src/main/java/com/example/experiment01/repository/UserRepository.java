package com.example.experiment01.repository;

import com.example.experiment01.entity.Adress;
import com.example.experiment01.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    //持久化上下文
    private EntityManager em;
    public void addUserAddress(){
        User user = new User("flj");
        em.persist(user);
        Adress adress1 = new Adress("123");
        adress1.setUser(user);
        em.persist(adress1);

        Adress adress2 = new Adress("234");
        adress2.setUser(user);
        em.persist(adress2);
    }
}
