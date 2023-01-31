package com.example.my_movie.model;

import io.swagger.annotations.ApiModelProperty;

public class film {
    @ApiModelProperty(notes = "le titre de film",name="film_name",required=true,value="Nice")
    private String titreFilm;
    @ApiModelProperty(notes = "Realisateur de film",name="film_relaisateur",required=true,value="chaymae")
    private String Realisateur;

    public film(String titre, String acteurPrincipal, String realisateur, String dateSortie) {
        this.titreFilm=titre;
        this.ActeurPrincipal=acteurPrincipal;
        this.Realisateur=realisateur;
        this.DateSortie=dateSortie;

    }

    public String getTitreFilm() {
        return titreFilm;
    }

    public void setTitreFilm(String titreFilm) {
        this.titreFilm = titreFilm;
    }

    public String getRealisateur() {
        return Realisateur;
    }

    public void setRealisateur(String realisateur) {
        Realisateur = realisateur;
    }

    public String getActeurPrincipal() {
        return ActeurPrincipal;
    }

    public void setActeurPrincipal(String acteurPrincipal) {
        ActeurPrincipal = acteurPrincipal;
    }

    public String getDateSortie() {
        return DateSortie;
    }

    public void setDateSortie(String dateSortie) {
        DateSortie = dateSortie;
    }

    @ApiModelProperty(notes = "l'acteur principal de film",name="acteur_film",required=true,value="bilal")
    private String ActeurPrincipal;
    @ApiModelProperty(notes = "la date de sortie de film",name="date_film",required=true,value="22-11-2000")
    private String DateSortie;

    @Override
    public String toString() {
        return "Film{" +
                "film_name='" + titreFilm+ '\'' +
                ", réalisateur='" + Realisateur + '\'' +
                ", acteurPrincipale='" + ActeurPrincipal + '\'' +
                ", DateSortie='" + DateSortie+ '\'' +
                '}';
    }
}
