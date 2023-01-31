package com.example.my_movie.controller;

import com.example.my_movie.model.actor;
import com.example.my_movie.model.film;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    static List<actor> ActorList = new ArrayList<actor>();
    static List<film> FilmList = new ArrayList<film>();

    static{
        FilmList .add(new film("Nice","ss","FR","22-11-3333"));
        FilmList .add(new film("Nice","ss","FR","22-11-3333"));
        FilmList .add(new film("Nice","ss","FR","22-11-3333"));
        ActorList .add(new actor("Nice","ss","22-11-3333",FilmList));

    }
    @RequestMapping("/Actors/{film}")
    public List<actor> getActorsByFilm(String filmTitle) {
        List<actor> result = new ArrayList<>();
        for (actor actor : ActorList) {
            for (film film : actor.getFilmography()) {
                if (film.getTitreFilm().equals(filmTitle)) {
                    result.add(actor);
                    break;
                }
            }
        }
        return result;
    }
    @RequestMapping("/ActorSearch/{name}")
    public actor getActorsByName(@PathVariable(value = "name") String name)
    {
        for (actor actor : ActorList) {
            if (actor.getNom().equals(name)) {
                return actor;
            }
        }
        return null;
    }

    @RequestMapping("/Actors")
    public List<actor> getAllActors()
    {

        return this.ActorList;
    }
    @RequestMapping("/Films")
    public List<film> getAllFilms()
    {

        return this.FilmList;
    }
    @RequestMapping("/FilmTitleSearch/{titre}")
    public film getFilmsBytitle(@PathVariable(value = "titre") String titre)
    {
        for (film film : FilmList) {
            if (film.getTitreFilm().equals(titre)) {
                return film;
            }
        }
        return null;
    }
    @RequestMapping("/FilmsSearchByDate/{Date}")
    public List<film> getFilmsByReleaseYear(@PathVariable(value = "Date") String date) {
        List<film> result = new ArrayList<>();
        for (film film : FilmList) {
            if (film.getDateSortie()== date) {
                result.add(film);
            }
        }
        return result;
    }
}
