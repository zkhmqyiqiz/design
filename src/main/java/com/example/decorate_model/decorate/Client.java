package com.example.decorate_model.decorate;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("小咪");
        System.out.println("第一种装扮:");
        Sneakers sneakers = new Sneakers();
        BigTrouer bigTrouer = new BigTrouer();
        Tshits tshits = new Tshits();
        //将person作为装饰添加到sneakers中
        sneakers.decorate(person);
        bigTrouer.decorate(sneakers);
        tshits.decorate(bigTrouer);
        tshits.show();
    }
}
