package com.gerasimenko.booklibrary.test;

import com.gerasimenko.booklibrary.dao.DAOFactory;
import com.gerasimenko.booklibrary.dao.implementation.DAOBookOfCatalogue;
import com.gerasimenko.booklibrary.dao.implementation.DAOLibraryUser;
import com.gerasimenko.booklibrary.entity.BookOfCatalogue;
import com.gerasimenko.booklibrary.entity.Genre;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by XXX on 30.04.2016.
 */
public class Runner {
    private final SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public List<Genre> findAll() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from Genre").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Runner().findAll());
        DAOBookOfCatalogue daoBookOfCatalogue = new DAOBookOfCatalogue();
        List<BookOfCatalogue> book = daoBookOfCatalogue.findAll();
        System.out.println(book);
        DAOLibraryUser daoLibraryUser = DAOFactory.createDAOLibraryUser();
        System.out.println(daoLibraryUser.findAll());
    }
}
