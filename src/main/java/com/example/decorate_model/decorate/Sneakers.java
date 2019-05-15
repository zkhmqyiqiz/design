package com.example.decorate_model.decorate;

public class Sneakers extends Decorate {
    @Override
    public void show() {
        System.out.print("球鞋  ");
        super.show();
    }
}
