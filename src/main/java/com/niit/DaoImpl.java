package com.niit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value = "doImpl")
public class DaoImpl implements ProductDao{
    @Autowired
    SessionFactory sessionFactory;
Product product;

    public void save(Product p) {
        Session openSession = sessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        openSession.save(p);
        beginTransaction.commit();
        openSession.close();

    }


    public void delete(Product p) {

        Session openSession = sessionFactory.openSession();
        Transaction beginTransaction = openSession.beginTransaction();
        openSession.delete(p);
        beginTransaction.commit();
        openSession.close();

    }
}
