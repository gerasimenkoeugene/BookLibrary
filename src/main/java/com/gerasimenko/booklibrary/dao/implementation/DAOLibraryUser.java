package com.gerasimenko.booklibrary.dao.implementation;

import com.gerasimenko.booklibrary.dao.interfaces.IDAOLibraryUser;
import com.gerasimenko.booklibrary.entity.LibraryUser;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by XXX on 09.05.2016.
 */
public class DAOLibraryUser implements IDAOLibraryUser {
    private final SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public List<LibraryUser> findAll() {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            return session.createQuery("from LibraryUser").list();
        } finally {
            tx.commit();
            session.close();
        }
    }

    public LibraryUser findUserByNick(String nickName) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            final Query query = session.createQuery("from LibraryUser as user where user.nickUser=:login");
            query.setString("login", nickName);
            LibraryUser libraryUser = (LibraryUser) query.iterate().next();
            return libraryUser;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean checkUserPassword(String nickName, String password) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            final Query query = session.createQuery("from LibraryUser as user where user.nickUser=:login and user.passwordUser=:password");
            query.setString("login", nickName);
            query.setString("password", password);
            LibraryUser libraryUser = (LibraryUser) query.iterate().next();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            tx.commit();
            session.close();
        }
    }

    public boolean isUserNotBanned(String nickName) {
        final Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
            final Query query = session.createQuery("from LibraryUser as user where user.nickUser=:login");
            query.setString("login", nickName);
            LibraryUser libraryUser = (LibraryUser) query.iterate().next();
            if (libraryUser.getIsBanned() == 1) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;

        } finally {
            tx.commit();
            session.close();
        }
    }
}
