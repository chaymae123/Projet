package com.example.my_finder.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class serviceResponse {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "callResponse_Fallback")
    public String callResponse(String name) {

        String response = restTemplate
                .exchange("http://localhost:8080/ActorSearch/{name}"
                        , HttpMethod.GET
                        , null
                        , new ParameterizedTypeReference<String>() {
                        }, name).getBody();

        return "this is my result : " + response;
    }

    @SuppressWarnings("unused")
    public String callResponse_Fallback(String name){
        return "le service est en panne actuellement, nous sommes désolé";
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
