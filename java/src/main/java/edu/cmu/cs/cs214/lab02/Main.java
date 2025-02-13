package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {

    /**
     * @param args heseg.
     */
    public static void main(final String[] args) {

        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(5);
        Shape circle = new Circle(7);

        Renderer rectRender = new Renderer(rectangle);
        Renderer squareRender = new Renderer(square);
        Renderer circleRender = new Renderer(circle);

        rectRender.draw();
        squareRender.draw();
        circleRender.draw();
    }
}
