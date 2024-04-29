package Ejercicio8;

public class Workers extends Employees{
    private String departament;

    public Workers(String workArea) {
    }

    public Workers(String name, int age, float salary, String departament) {
        super(name, age, salary);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String Departament) {
        this.departament = departament;
    }
    public void presentation(){
        System.out.println("Nombre: "+super.getName());
        System.out.println("Edad: "+super.getAge());
        System.out.println("Salario: $"+super.getSalary());
    }

    public void organizeActivity(){
        System.out.println(super.getName()+" Realizo una obra en equipo ");
    }
    public void work() {
        System.out.println("El trabajador "+super.getName()+" esta trabajando");
    }
}
