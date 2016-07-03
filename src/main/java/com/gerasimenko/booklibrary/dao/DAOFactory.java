package com.gerasimenko.booklibrary.dao;

import com.gerasimenko.booklibrary.dao.implementation.DAOBookOfCatalogue;
import com.gerasimenko.booklibrary.dao.implementation.DAOLibraryUser;
import com.gerasimenko.booklibrary.dao.implementation.DAOUserBook;

/**
 * Created by XXX on 09.05.2016.
 */
public class DAOFactory {

    public static DAOBookOfCatalogue createDAOBookOfCatalogue() {
        return new DAOBookOfCatalogue();
    }

    public static DAOLibraryUser createDAOLibraryUser() {
        return new DAOLibraryUser();
    }

    public static DAOUserBook createDAOUserBook() {
        return new DAOUserBook();
    }
}
