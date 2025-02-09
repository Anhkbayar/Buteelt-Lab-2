package edu.cmu.cs.cs214.lab02.shapes;

/**
* Kvadratiin talbaig oloh.
*/
public class Square implements Shape {
    public double sideLen;

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
