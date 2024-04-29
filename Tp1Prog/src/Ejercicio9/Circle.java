package Ejercicio9;

public class Circle extends GeometricFigure{
    private double radio;

    public Circle(){
    }
    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return (double) (Math.PI*radio*radio);
    }

    @Override
    public double calculatePerimeter() {

        return (double) (2*Math.PI*radio);
    }
}

