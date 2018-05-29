package com.suncorp.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestController {

    @ApiOperation( value ="Sample to test Spring boot micro-service", notes = "Sample to test Spring boot micro-service" )
    @RequestMapping( value = "/api/hello", method = RequestMethod.GET, produces = {"text/html"}  )
    public String hello(){
        return "Welcome to Spring Boot";
    }
}
