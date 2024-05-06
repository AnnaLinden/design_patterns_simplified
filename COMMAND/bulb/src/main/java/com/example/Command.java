package com.example;

// Command Interface
interface Command {
    void execute();

    void undo();

    void redo();
}