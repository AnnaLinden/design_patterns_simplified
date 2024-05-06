package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();

        Command turnOn = new TurnOn(bulb);
        Command turnOff = new TurnOff(bulb);

        RemoteControl remote = new RemoteControl();
        remote.submit(turnOn); // Outputs: Bulb has been lit
        remote.submit(turnOff); // Outputs: Darkness!
    }
}
