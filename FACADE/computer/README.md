# Facade Design Pattern

The Facade pattern is often used when a system is very complex or difficult to understand because the system has a large number of interdependent classes or its source code is unavailable. This pattern provides a simplified interface to a larger body of code.

## Description

A Facade is an object that provides a simplified interface to a larger body of code, such as a class library. The Facade can make a software library easier to understand and use, more readable, and reduce dependencies on external code.

The example below, originally taken from [Design Patterns for Humans](https://github.com/kamranahmedse/design-patterns-for-humans), is initially written in PHP. This example has been adapted to Java.

## Java Implementation

### Computer Class

This class represents a complex subsystem.

```java
class Computer {
    public void getElectricShock() {
        System.out.println("Ouch!");
    }

    public void makeSound() {
        System.out.println("Beep beep!");
    }

    public void showLoadingScreen() {
        System.out.println("Loading...");
    }

    public void bam() {
        System.out.println("Ready to be used!");
    }

    public void closeEverything() {
        System.out.println("Bup bup bup buzzzz!");
    }

    public void sooth() {
        System.out.println("Zzzzz");
    }

    public void pullCurrent() {
        System.out.println("Haaah!");
    }
}
ComputerFacade Class
This class acts as the facade, providing simpler interfaces to the subsystem.

java
Copy code
class ComputerFacade {
    private Computer computer;

    public ComputerFacade(Computer computer) {
        this.computer = computer;
    }

    public void turnOn() {
        computer.getElectricShock();
        computer.makeSound();
        computer.showLoadingScreen();
        computer.bam();
    }

    public void turnOff() {
        computer.closeEverything();
        computer.pullCurrent();
        computer.sooth();
    }
}
Main Class
This class demonstrates the use of the Facade pattern.

java
Copy code
public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new Computer());
        computer.turnOn(); // Output: Ouch! Beep beep! Loading... Ready to be used!
        computer.turnOff(); // Output: Bup bup bup buzzzz! Haaah! Zzzzz
    }
}
Explanation
In this example, the ComputerFacade provides a simple interface to the complex operations of the Computer class. Users interact with the facade instead of directly with the subsystem, making it easier to operate the computer.

css
```
