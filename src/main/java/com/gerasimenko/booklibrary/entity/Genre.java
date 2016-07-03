package com.gerasimenko.booklibrary.entity;

/**
 * Created by XXX on 30.04.2016.
 */
public class Genre {
    private Integer idGenre;
    private String genreName;

    public Genre() {
    }

    public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreName='" + genreName + '\'' +
                '}';
    }
}
