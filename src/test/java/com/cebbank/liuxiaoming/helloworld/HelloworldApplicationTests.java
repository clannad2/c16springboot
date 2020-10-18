package com.cebbank.liuxiaoming.helloworld;

import com.cebbank.liuxiaoming.helloworld.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ctx;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void test1(){
        boolean flag = ctx.containsBean("helloService");
        System.out.println(flag);
    }

}
