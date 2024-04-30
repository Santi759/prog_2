package Ejercicio1;

public class Bird extends Animal{
    private String species;
    private boolean speak;

    public Bird() {
    }

    public Bird(String name, int ayes, double price, String typeAnimal, String species, boolean speak) {
        super(name, ayes, price, typeAnimal,null);
        this.species = species;
        this.speak = speak;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    @Override
    public String toString() {
        if (isSpeak()) {
            return super.toString() + "--- Especie: " + species + " Habla: SI";
        }else {
            return super.toString() + "--- Especie: " + species + " Habla: NO";
        }
    }
    @Override
    public void feed(String name){
        System.out.println(super.getName()+" esta comiendo");
    }
}
