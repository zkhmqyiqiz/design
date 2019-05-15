package com.example.decorate_model.decorate;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("装扮人"+name);
    }
}
