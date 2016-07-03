package com.gerasimenko.booklibrary.validator;

import com.gerasimenko.booklibrary.dao.DAOFactory;
import com.gerasimenko.booklibrary.dao.implementation.DAOLibraryUser;
import com.gerasimenko.booklibrary.entity.LibraryUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by XXX on 09.05.2016.
 */
public class Validator {
    private static Pattern pattern = Pattern.compile("[\\w\\u005F\\u002E]+", Pattern.UNICODE_CASE);

    public static boolean validateRegistration(String login, String password, String confirmPassword, String name, String surname) {
        if (login == null || password == null
                || confirmPassword == null || name == null || surname == null)
            return false;
        if ((login.equals(""))
                || (password.equals(""))
                || (confirmPassword.equals(""))
                || (name.equals("")) || (surname.equals("")) || !password.equals(confirmPassword)) {
            return false;
        }
        if (!isNumOrLetter(login)) return false;
        if (!isNumOrLetter(password)) return false;
        if (isNickNameExist(login)) {
            return false;
        } else return true;
    }


    public static boolean isNickNameExist(String nickName) {
        DAOLibraryUser userDAO = DAOFactory.createDAOLibraryUser();
        LibraryUser libraryUser = userDAO.findUserByNick(nickName);
        if (libraryUser == null) {
            return false;
        } else {
            return true;
        }

    }


    public static boolean isNumOrLetter(String str) {
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
