package com.example.my_finder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
    @Autowired
    serviceResponse serviceResponse;

    @RequestMapping(value = "/showMovies/{name}", method = RequestMethod.GET)
    public String showMovies(@PathVariable(value = "name") String name) {
        return serviceResponse.callResponse(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getResponseTest() {
        return "test";
    }

}
