package Ejercicio1;

public class Dog extends Animal{
    private String race;
    private boolean vaccinated;

    public Dog() {
    }

    public Dog(String name, int ayes, double price, String typeAnimal,String race, boolean vaccinated) {
        super(name, ayes, price, typeAnimal,null);
        this.race = race;
        this.vaccinated = vaccinated;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    @Override
    public String toString(){
        if (isVaccinated()){
            return super.toString()+ "--- Raza: "+race+" ---Vacunado: SI";
        }else {
            return super.toString()+ "--- Raza: "+race+" ---Vacunado: NO";
        }
    }

    @Override
    public void feed(String name){
        System.out.println(super.getName()+" esta comiendo");
    }

}
