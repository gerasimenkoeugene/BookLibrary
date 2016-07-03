package com.gerasimenko.booklibrary.entity;


public class BookOfCatalogue {
    private Integer idBook;
    private String bookName;
    private String authorName;
    private String bookDescription;
    private Integer bookPages;
    private Genre genre;
    private Integer isBooked;


    public BookOfCatalogue() {
    }

    public BookOfCatalogue(Integer idBook) {
        this.idBook = idBook;
    }

    public BookOfCatalogue(Integer idBook, String bookName, String authorName) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Integer getBookPages() {
        return bookPages;
    }

    public void setBookPages(Integer bookPages) {
        this.bookPages = bookPages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(Integer isBooked) {
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "BookOfCatalogue{" +
                "idBook=" + idBook +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookDescription='" + bookDescription + '\'' +
                ", bookPages=" + bookPages +
                ", genre=" + genre +
                ", isBooked=" + isBooked +
                '}';
    }
}
