package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Dursuudiig hevleh.
 */
public class Renderer {

    private final Shape shape;

    Renderer(Shape shape) {
        this.shape = shape;
    }

    void draw() {
        double area = shape.getArea();

        System.out.println("Shape printed\n");
        System.out.println("Its area is " + area);
    }
}
