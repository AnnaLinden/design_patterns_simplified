package com.example;

public class WildDogAdapter implements Lion {
    private WildDog dog;

    public WildDogAdapter(WildDog dog) {
        this.dog = dog;
    }

    public void roar() {
        // Adapting the bark method of WildDog to the roar method of Lion
        dog.bark();
    }

}
