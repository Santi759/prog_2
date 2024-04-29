package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        System.out.println("Área del circulo: "+c1.calculateArea());
        System.out.println("Perimetro del circulo: "+c1.calculatePerimeter());
        System.out.println(" ");

        Rectangle r1 = new Rectangle(2.5,3);
        System.out.println("Área del rectángulo: "+r1.calculateArea());
        System.out.println("Perimetro del rectángulo: "+r1.calculatePerimeter());
    }
}