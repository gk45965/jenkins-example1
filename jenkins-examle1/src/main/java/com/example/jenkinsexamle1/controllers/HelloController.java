package com.example.jenkinsexamle1.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOG = LogManager.getLogger("org");


    @RequestMapping
    public String hello()
    {
        LOG.info("hello jenkins  api invoked successfully ");
        System.out.println(" hello jenkins  api invoked successfully in system out");
        return "hello jenkins example 2" ;
    }


}
