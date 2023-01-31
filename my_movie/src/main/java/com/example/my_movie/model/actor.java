package com.example.my_movie.model;

import java.util.List;

public class actor {

    private String Nom;

    private String Prénom;

    public actor(String nom, String prenom, String datenaissance, List filmographie) {
        this.Nom=nom;
        this.Prénom=prenom;
        this.DateNaissance=datenaissance;
        this.filmography=filmographie;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrénom() {
        return Prénom;
    }

    public void setPrénom(String prénom) {
        Prénom = prénom;
    }

    public String getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public List<film> getFilmography() {
        return filmography;
    }

    public void setFilmography(List<film> filmography) {
        this.filmography = filmography;
    }


    private String DateNaissance;

    private List<film> filmography;


}
