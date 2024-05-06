package com.example;

public class Main {
    public static void main(String[] args) {
        WildDogAdapter wildDogAdapter = new WildDogAdapter(new WildDog());

        Hunter hunter = new Hunter();
        hunter.hunt(wildDogAdapter);
    }
}