package com.cebbank.liuxiaoming.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloconcroller {

    @RequestMapping("/hello")
    public  String hello(){
        return "hello world quick";
    }
}
