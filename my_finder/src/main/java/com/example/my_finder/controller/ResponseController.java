package com.example.my_finder.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Swagger2DemoRestController", description = "REST Apis related to Movies Entity!!!!")
public class ResponseController {

    @Autowired
    serviceResponse serviceResponse;
    @ApiOperation(value = "Get list of Mivies in the System ", response = Iterable.class, tags = "Actors")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })
    @RequestMapping(value = "/showMovies/{name}", method = RequestMethod.GET)
    public String showMovies(@PathVariable(value = "name") String name) {
        return serviceResponse.callResponse(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getResponseTest() {
        return "test";
    }

}
