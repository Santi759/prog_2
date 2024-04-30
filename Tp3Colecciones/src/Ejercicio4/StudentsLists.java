package Ejercicio4;
import java.util.List;
import java.util.ArrayList;

public class StudentsLists {

    private List<Student>students;

    public StudentsLists() {
        this.students = new ArrayList<>();
    }

    public StudentsLists(List<Student> students) {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void showStudents(){
        System.out.println("Lista de Estudiantes");
        for (Student student: students){
            System.out.println("--Nombre:"+student.getName());
            System.out.println("--Edad: "+student.getAge());
            System.out.println("--Nota: "+student.getGrade());
            System.out.println(" ");
        }
    }

    public void calculateMean(){
        System.out.println("Promedio de las notas:");
        double total = 0;
        for (Student student:students){
            total += student.getGrade();
        }
        double mean = total/students.size();
        System.out.println("La media de las notas es: "+mean);
    }

    public void highGrade(){
        System.out.println("Estudiante con la nota más alta: ");
        double highGrade = 0;
        String studentHighGrade = "";
        for (Student student:students){
            if (student.getGrade()>highGrade){
                highGrade = student.getGrade();
                studentHighGrade = student.getName();
            }
        }
        System.out.println("El alumno con la nota más alta es "+studentHighGrade+" con un "+highGrade);
    }

    public Student searchStudent(String name){
        for(Student student:students){
            if (student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;
    }



}
