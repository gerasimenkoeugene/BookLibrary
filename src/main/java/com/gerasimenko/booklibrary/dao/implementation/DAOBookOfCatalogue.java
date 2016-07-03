package com.gerasimenko.booklibrary.dao.implementation;

import com.gerasimenko.booklibrary.entity.BookOfCatalogue;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by XXX on 30.04.2016.
 */
public class DAOBookOfCatalogue {
    private final static SessionFactory factory = new Configuration().configure().buildSessionFactory();
    public List<BookOfCatalogue> findAll() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from BookOfCatalogue book join fetch book.genre").list();
        } finally {
            tx.commit();
            session.close();
        }
    }
}
