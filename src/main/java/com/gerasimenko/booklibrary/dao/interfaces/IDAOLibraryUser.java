package com.gerasimenko.booklibrary.dao.interfaces;

import com.gerasimenko.booklibrary.entity.LibraryUser;

import java.util.List;

/**
 * Created by XXX on 09.05.2016.
 */
public interface IDAOLibraryUser {
    public boolean checkUserPassword(String nickName, String password);
    public boolean isUserNotBanned(String nickName);
    public List<LibraryUser> findAll();
    public LibraryUser findUserByNick(String nickName);

}
