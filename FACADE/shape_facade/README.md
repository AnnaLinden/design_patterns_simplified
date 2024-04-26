## Facade Design Pattern

The Facade Pattern simplifies the interface of a complex system. This structural design pattern adds an interface to an existing system to hide its complexities, making it easier for client applications to interact with the system.

![Facade Pattern UML Diagram](/FACADE/shape_facade/src/main/resources/facade_diagram.JPG)

### Implementation Summary

- **Shape Interface**: Defines the basic `draw` method that all shapes will implement.
- **Concrete Classes**:

  - [Rectangle](/FACADE/shape_facade/src/main/java/com/example/Rectangle.java) implements the [Shape](/FACADE/shape_facade/src/main/java/com/example/Shape.java) interface.
  - [Square](/FACADE/shape_facade/src/main/java/com/example/Square.java) implements the `Shape` interface.
  - [Circle](/FACADE/shape_facade/src/main/java/com/example/Circle.java) implements the `Shape` interface.

- **Facade Class (ShapeMaker)**: Provides simplified methods to draw various types of shapes using the concrete classes.
- **Main Class**: Uses the [ShapeMaker](/FACADE/shape_facade/src/main/java/com/example/ShapeMaker.java) class to demonstrate drawing different shapes.

### Steps in Implementation

1. **Create an interface**: `Shape` with a method `draw()`.
2. **Implement the interface** in concrete classes: `Rectangle`, `Square`, and `Circle`.
3. **Create a facade class**: `ShapeMaker` with methods to draw each shape, which internally delegate calls to the respective shape classes.
4. **Use the facade** in the `FacadePatternDemo` class to draw various shapes and verify the output.

### Example Output

- Circle::draw()
- Rectangle::draw()
- Square::draw()

For more detailed information and UML diagrams, see the original article on [Facade Pattern](https://www.tutorialspoint.com/design_pattern/facade_pattern.htm).
