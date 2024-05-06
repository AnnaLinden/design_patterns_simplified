package com.example;

public class GreenCircle implements DrawBridge {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", y:" + y + "]");

    }

}
