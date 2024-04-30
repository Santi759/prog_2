package Ejercicio1;

public class Cat extends Animal{
    private String race;
    private boolean sterilized;

    public Cat() {
    }

    public Cat(String name, int ayes, double price, String typeAnimal, String race, boolean sterilized) {
        super(name, ayes, price, typeAnimal,null);
        this.race = race;
        this.sterilized = sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }
    @Override
    public String toString() {
        if (isSterilized()) {
            return super.toString() + "--- Raza: " + race + "--- Esterilizado: SI";
        }else {
            return super.toString() + "--- Raza: " + race + "--- Esterilizado: NO";
        }
    }
    @Override
    public void feed(String name){
        System.out.println(super.getName()+" esta comiendo");
    }
}
