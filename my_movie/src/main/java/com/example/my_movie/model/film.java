package com.example.my_movie.model;

public class film {

    private String titreFilm;

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


    private String ActeurPrincipal;

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
