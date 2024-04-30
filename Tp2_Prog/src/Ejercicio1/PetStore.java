package Ejercicio1;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class PetStore {
    private List <Animal> listAnimals;

    public PetStore() {
        this.listAnimals = new ArrayList<>();
    }

    public PetStore(List<Animal> listAnimals) {
        this.listAnimals = listAnimals;
    }

    public List<Animal> getListAnimals() {
        return listAnimals;
    }

    public void setListAnimals(List<Animal> listAnimals) {
        this.listAnimals = listAnimals;
    }
    public void addAnimal(Animal animal){
        listAnimals.add(animal);
    }

    public void feedAnimal(String name) {
        for (Animal animal : listAnimals) {
            if (animal.getName().equals(name)) {
                animal.feed(name);
            }
        }
    }

    public void sellAnimal(String name){
        Iterator<Animal> iterator = listAnimals.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if (animal.getName().equals(name)){
                iterator.remove();
                System.out.println("Se ha vendido el animal: "+animal);
            }
        }
    }

    public void showAnimals(){
        for (Animal animal : listAnimals) {
            System.out.println(animal);
            System.out.println(" ");
        }
    }

}
