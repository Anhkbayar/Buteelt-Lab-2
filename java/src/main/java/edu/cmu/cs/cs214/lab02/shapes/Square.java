package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Kvadratiin talbaig oloh.
 */
public class Square implements Shape {

    /**
     * Taliin urt.
     */
    private final double sideLen;

    /**
     * Taliig avch obiektiig uusgene.
     *
     * @param sideLength taliin urtiig avna.
     */
    public Square(final double sideLength) {
        this.sideLen = sideLength;
    }

    @Override
    public final double getArea() {
        return sideLen * sideLen;
    }
}
