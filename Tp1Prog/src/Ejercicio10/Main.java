package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        TextBook tx1 = new TextBook("La Odisea","Homero",6000,"3ro");
        tx1.showDates();
        System.out.println(" ");

        UniversityTextBook unt = new UniversityTextBook("Investigacion-humnana","Juan Fernando Quintero", 80000,"Universidad Nacional de Colombia");
        unt.showDates();
        System.out.println(" ");
        Novels n1 = new Novels("Fuego y Sangre","George R.R. Martin",41950,"Ciencia Ficción");
        n1.showDates();
    }
}
