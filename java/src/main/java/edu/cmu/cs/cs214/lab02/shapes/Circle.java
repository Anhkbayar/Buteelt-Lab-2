package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Dugui dursiin talbaig oloh.
 */
public class Circle implements Shape {

    /**
     * Duguin radius.
     */
    private double radius;

    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param newradius radius.
     */
    public Circle(double newradius) {
        this.radius = newradius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
