package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public final class Main {

    /**
     * Private constructor to prevent instantiation.
     */
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * @param args heseg.
     */
    public static void main(final String[] args) {
        final double rectHeight = 2;
        final double rectWidth = 3;
        final double squareSide = 5;
        final double circleRadius = 7;

        Shape rectangle = new Rectangle(rectHeight, rectWidth);
        Shape square = new Square(squareSide);
        Shape circle = new Circle(circleRadius);

        Renderer rectRender = new Renderer(rectangle);
        Renderer squareRender = new Renderer(square);
        Renderer circleRender = new Renderer(circle);

        rectRender.draw();
        squareRender.draw();
        circleRender.draw();
    }
}
