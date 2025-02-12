package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Represents a rectangle shape with a height and width.
 */
public class Rectangle implements Shape {

    /**
     * The height of the rectangle.
     */
    private final double height;

    /**
     * The width of the rectangle.
     */
    private final double width;

    /**
     * Constructs a Rectangle with specified height and width.
     *
     * @param height the height of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(final double height, final double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Returns the height of the rectangle.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    @Override
    public final double getArea() {
        return height * width;
    }
}
