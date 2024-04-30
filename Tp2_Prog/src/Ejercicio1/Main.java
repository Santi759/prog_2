package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        // Creo un objeto de la clase PetStore
        PetStore pS = new PetStore();
        //Creo objetos para los animales
        Dog d1 = new Dog("Marley",11,200000,"Perro","Labrador",true);
        Cat c1 = new Cat("Garfield",3,150000,"Gato","Persa",true);
        Bird b1 = new Bird("Rio",2,25000,"Ave","Canario",false);
        Fizz f1 = new Fizz("Nemo",5,16000,"Pez","Payaso",false);

        //Agregamos los animales creados a la lista de la tienda
        pS.addAnimal(d1);
        pS.addAnimal(c1);
        pS.addAnimal(b1);
        pS.addAnimal(f1);

        //Mostramos la lista de animales en la tienda
        pS.showAnimals();

        //Alimentamos a algún animal
        pS.feedAnimal("Nemo");
        pS.feedAnimal("Marley");

        System.out.println(" ");

        //Vendemos un animal
        pS.sellAnimal("Garfield");

        System.out.println("");
        //Mostramos la lista de animales en la tienda
        pS.showAnimals();





    }
}