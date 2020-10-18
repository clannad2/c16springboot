package com.cebbank.liuxiaoming.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloconcroller {
    @Value("${person.name}")
    String name;
    @RequestMapping("/hello")
    public  String hello(){
        return "hello world quick"+name;
    }
}
