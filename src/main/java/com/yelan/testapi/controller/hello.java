package com.yelan.testapi.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class hello {

    @RequestMapping("/hello")
    public String helloworld(){
        return "helloworld";
    }

}
