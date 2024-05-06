package com.example;

public class Circle extends Shape {
    private int x, y, radius;

    protected Circle(int x, int y, int radius, DrawBridge bridge) {
        super(bridge);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        bridge.drawCircle(radius, x, y);
    }

}
