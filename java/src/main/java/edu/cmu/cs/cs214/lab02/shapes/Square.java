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
     * @param sideLen taliin urtiig avna.
     */
    public Square(final double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public final double getArea() {
        return sideLen * sideLen;
    }
}
