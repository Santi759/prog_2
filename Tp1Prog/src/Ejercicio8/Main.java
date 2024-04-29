package Ejercicio8;

public class Main {
    public static void main(String[] args) {

        Manager m1 = new Manager("Claudia",48,500000,"Recursos Humanos");
        m1.presentation();
        m1.organizeActivity();
        m1.work();
        System.out.println(" ");

        Workers w1 = new Workers("Gabriel",35,350000,"Produccion");
        w1.presentation();
        w1.organizeActivity();
        w1.work();
    }
}