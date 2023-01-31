package com.example.my_movie.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class actor {
    @ApiModelProperty(notes = "le nom d'acteur",name="actor_name",required=true,value="Nice")
    private String Nom;
    @ApiModelProperty(notes = "le prenom d'acteur",name="actor_prenom",required=true,value="chaymae")
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

    @ApiModelProperty(notes = "la date de naissance d'acteur",name="date_acteur",required=true,value="22-11-1234")
    private String DateNaissance;
    @ApiModelProperty(notes = "filmographie d'acteur",name="filmographie_acteur",required=true)
    private List<film> filmography;


}
