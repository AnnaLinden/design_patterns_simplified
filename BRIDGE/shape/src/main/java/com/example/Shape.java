package com.example;

public abstract class Shape {

    protected DrawBridge bridge;

    protected Shape(DrawBridge bridge) {
        this.bridge = bridge;
    }

    public abstract void draw();
}
