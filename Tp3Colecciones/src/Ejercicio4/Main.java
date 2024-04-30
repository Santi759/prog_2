package Ejercicio4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentsLists students = new StudentsLists();

        students.addStudent(new Student("Santiago",20,8.5));
        students.addStudent(new Student("Mercedes",19,8.5));
        students.addStudent(new Student("Cristian",18,3.5));
        students.addStudent(new Student("Patricio",21,9.5));

        students.showStudents();
        System.out.println(" ");
        students.calculateMean();
        System.out.println(" ");
        students.highGrade();
        System.out.println(" ");
        System.out.println("Ingrese el nombre del alumno que desea buscar: ");
        String nameSearch = sc.nextLine();
        Student foundStudent = students.searchStudent(nameSearch);


        if (foundStudent != null){
            System.out.println("Alumno encontrado: ");
            System.out.println("Nombre: "+foundStudent.getName());
            System.out.println("Edad: "+foundStudent.getAge());
            System.out.println("Nota: "+foundStudent.getGrade());
        }else {
            System.out.println("Alumno no registrado");
        }

    }
}
