package Ejercicio9;

public class Rectangle extends GeometricFigure{
    private double bload;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double bload, double length) {
        this.bload = bload;
        this.length = length;
    }

    public double getBload() {
        return bload;
    }

    public void setBload(double bload) {
        this.bload = bload;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {

        return bload * length;
    }
    @Override
    public double calculatePerimeter() {

        return 2 * (bload + length);
    }
}