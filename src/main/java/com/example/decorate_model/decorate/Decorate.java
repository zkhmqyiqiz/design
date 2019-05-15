package com.example.decorate_model.decorate;

public class Decorate extends Person{
    public Person person;
    //打扮
    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null){
            person.show();
        }
        //super.show();
    }
}
