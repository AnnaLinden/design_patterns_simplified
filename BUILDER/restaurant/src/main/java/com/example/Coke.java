package com.example;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 15.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }

}
