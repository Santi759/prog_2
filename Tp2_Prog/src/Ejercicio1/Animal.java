package Ejercicio1;

public abstract class Animal {
    private String name;
    private int ayes;
    private  double price;
    private String typeAnimal;
    private PetStore petStore;

    public Animal() {
    }

    public Animal(String name, int ayes, double price, String typeAnimal, PetStore petStore) {
        this.name = name;
        this.ayes = ayes;
        this.price = price;
        this.typeAnimal = typeAnimal;
        this.petStore = petStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAyes() {
        return ayes;
    }

    public void setAyes(int ayes) {
        this.ayes = ayes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public PetStore getPetStore() {
        return petStore;
    }

    public void setPetStore(PetStore petStore) {
        this.petStore = petStore;
    }

    @Override
    public String toString(){
        return "Nombre: "+name+"--- Años: "+ayes+"--- Precio: "+price+ "--- Tipo de Animal: "+typeAnimal;
    }

    public void feed(String name){
    }
}
