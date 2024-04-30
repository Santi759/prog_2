package Ejercicio1;

public class Fizz extends Animal{
    private String species;
    private boolean predator;

    public Fizz() {
    }

    public Fizz(String name, int ayes, double price, String typeAnimal, String species, boolean predator) {
        super(name, ayes, price, typeAnimal,null);
        this.species = species;
        this.predator = predator;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }
    @Override
    public String toString() {
        if (isPredator()) {
            return super.toString() + "--- Especie: " + species + " Es depredador: SI";
        }else {
            return super.toString() + "--- Especie: " + species + " Es depredador: NO";
        }
    }
    @Override
    public void feed(String name) {
        System.out.println(name+" esta comiendo");
    }
}
