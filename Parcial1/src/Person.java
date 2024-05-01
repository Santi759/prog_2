public class Person {

    //Atributos de persona
    private String name;
    private int dni;

    //Creamos sus constructores y métodos getters y setters para poder acceder a su nombe y dni
    public Person() {
    }

    public Person(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
