package com.neoteric.javadockerdemo.javadockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/dockerdemo")
    public String dockerdemo(){
        return "dockerdemo with jenkins and docker spring boot";
    }

}
