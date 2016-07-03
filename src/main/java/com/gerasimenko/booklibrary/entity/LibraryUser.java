package com.gerasimenko.booklibrary.entity;


public class LibraryUser {
    private Integer idUser;
    private Integer idTypeUser;
    private String nickUser;
    private String passwordUser;
    private String nameUser;
    private String surnameUser;
    private String phoneNumber;
    private String email;
    private int booksAmount;
    private int isBanned;


    public LibraryUser() {
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNickUser() {
        return nickUser;
    }

    public void setNickUser(String nickUser) {
        this.nickUser = nickUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBooksAmount() {
        return booksAmount;
    }

    public void setBooksAmount(int booksAmount) {
        this.booksAmount = booksAmount;
    }

    public int getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(int isBanned) {
        this.isBanned = isBanned;
    }

    public Integer getIdTypeUser() {
        return idTypeUser;
    }

    public void setIdTypeUser(Integer idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "idUser=" + idUser +
                ", idTypeUser=" + idTypeUser +
                ", nickUser='" + nickUser + '\'' +
                ", passwordUser='" + passwordUser + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", surnameUser='" + surnameUser + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", booksAmount=" + booksAmount +
                ", isBanned=" + isBanned +
                '}';
    }
}
