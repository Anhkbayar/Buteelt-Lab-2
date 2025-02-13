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
     * @param undur the height of the rectangle
     * @param urgun the width of the rectangle
     */
    public Rectangle(final double undur, final double urgun) {
        this.height = undur;  // this.height нь ангийн гишүүн өгөгдлийг заана
        this.width = urgun;    // this.width нь ангийн гишүүн өгөгдлийг заана
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
