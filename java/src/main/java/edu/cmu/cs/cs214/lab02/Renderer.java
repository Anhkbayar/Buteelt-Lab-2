package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Dursuudiig hevleh.
 */
public class Renderer {

    /**
     * Shapeiin interfacees object uusgeh.
     */
    private final Shape shape;

    /**
     * @param helber baiguulagchiin parameter.
     */
    Renderer(final Shape helber) {
        this.shape = helber;
    }

    /**
     * oruulsan dursiin talbaig olood console deer hevleh.
     */
    void draw() {
        double area = shape.getArea();

        System.out.println("Shape printed\n");
        System.out.println("Its area is " + area);
    }
}
