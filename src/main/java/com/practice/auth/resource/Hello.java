package com.practice.auth.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${server.port}")
    private String portNumber;

    @GetMapping(value = "/hello")
    public String hello(){
        return portNumber;
    }
}
