package com.example.jenkinsexamle1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String hello()
    {
        return "hello jenkins" ;
     }


}
