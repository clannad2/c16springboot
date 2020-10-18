package com.cebbank.liuxiaoming.helloworld.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    private String name;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Dog dog;
    private Map<String,Object> map;
    private List<Object> list;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public Date getBirth() {
        return birth;
    }

    public Dog getDog() {
        return dog;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", dog=" + dog +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
