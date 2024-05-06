package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Caretaker caretaker = new Caretaker();

        calc.add(10); // calculator is at 10
        caretaker.addMemento(calc.save()); // Save state

        calc.add(5); // calculator is at 15
        caretaker.addMemento(calc.save()); // Save state

        calc.subtract(8); // calculator is at 7
        System.out.println("Current Value: " + calc.getCurrentValue()); // Output: 7

        // Restoring to the first saved state (value was 10)
        calc.restore(caretaker.getMemento(0));
        System.out.println("Restored Value: " + calc.getCurrentValue()); // Output: 10
    }
}