package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Novel nl = new Novel("Billy Summers",false,"Stephen King",2021,"Crimen");
        Academic ac1 = new Academic("Fisica Universitaria",false,"Hugh Young", 1989,"Fisica");
        Childish ch1 = new Childish("Los once",true,"Roberto Santiago",2015,30);

        Library l1 = new Library();

        l1.addBook(nl);
        l1.addBook(ac1);
        l1.addBook(ch1);

        l1.listBook();
        System.out.println("----------------------------------");

        l1.toggleBookStatus("Billy Summers");
        l1.toggleBookStatus("Los once");
        l1.toggleBookStatus("Canciones de hielo y fuego");
        System.out.println("----------------------------------");

        l1.listBook();





    }
}
