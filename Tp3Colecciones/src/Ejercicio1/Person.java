package Ejercicio1;

public abstract class Person {
    protected int dni;
    protected String name;

    public Person(int idn, String name) {
        this.dni = dni;
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


