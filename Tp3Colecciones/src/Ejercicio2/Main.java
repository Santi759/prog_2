package Ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        Employee employee1 = new Employee("Jorge");
        Employee employee2 = new Employee("Romina");
        Employee employee3 = new Employee("Soledad");


        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);

        employee2.assingSupervisor(employee1);
        employee1.assingSupervisor(employee3);

        for (Employee employees : employee){
            System.out.println("Nombre del empleado: " +employees.getName());
            System.out.println("Supervisor del empleado: "+employees.nameSupervisor());
            System.out.println(" ");

        }

    }
}