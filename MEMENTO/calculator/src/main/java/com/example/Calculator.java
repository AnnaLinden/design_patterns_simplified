package com.example;

//originator
public class Calculator {
    private int currentValue = 0;

    public void setCurrentValue(int value) {
        this.currentValue = value;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public Memento save() {
        return new Memento(currentValue);
    }

    public void restore(Memento m) {
        this.currentValue = m.getState();
    }

    public void add(int number) {
        currentValue += number;
    }

    public void subtract(int number) {
        currentValue -= number;
    }

}
