package Ejercicio2;


public class Employee {
    private String name;
    private Employee supervisor;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }
    public void assingSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }
    public String nameSupervisor(){
        if (supervisor !=null){
            return supervisor.getName();
        }else {
            return "Sin supervisor";
        }
    }
}
