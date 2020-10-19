package com.cebbank.liuxiaoming.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class helloconcroller {

    @RequestMapping("/hello")
    public  String hello(){
        return "hello world quick";
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

//    @RequestMapping(value = {"/","/index.html"})
//    public String index(){
//        return "index";
//    }

}
