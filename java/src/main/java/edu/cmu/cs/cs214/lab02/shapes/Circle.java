package edu.cmu.cs.cs214.lab02.shapes;

/**
* Dugui dursiin talbaig oloh.
*/

public class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
