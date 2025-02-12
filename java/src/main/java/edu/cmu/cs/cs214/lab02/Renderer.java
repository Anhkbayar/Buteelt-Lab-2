package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

/**
 * Dursuudiig hevleh.
 */
public class Renderer {

    private Rectangle rectangle;

    Renderer(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    void draw() {
        double area = rectangle.getArea();

        // assume implementation
        System.out.println("Shape printed\n");
        System.out.println("Its area is " + area);
    }
}
