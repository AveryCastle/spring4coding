package com.apress.isf.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seoungjuhyun on 10/27/15.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    public String getMessage(){
        return "<h1>Hello, World</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}
