package Ejercicio1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Subject s1 = new Subject("Lengua Extranjera 1",1,"8.30");
        Subject s2 = new Subject("Matemática 2",2,"10.30");
        Subject s3 = new Subject("Informatica 1",5,"11.30");
        Teacher t1 = new Teacher(12345678,"Maria Antich","Ingenieria",s1);

        int counter=0;

        t1.addSubject(s2);
        t1.addSubject(s3);

        //Ejercicio A
        System.out.println("Aula de la tercera asignatura del profesor "+t1.getName());
        for (Subject s : t1.getSubjects()){
            counter++;
            if (counter==3){
                System.out.println("Aula de la tercer Asignatura: "+s.getClassroom());
            }
        }
        System.out.println("");
        //B) Mostrar el nombre de las asignaturas que imparte el profesor

        System.out.println("Asignaturas del profesor:");

        for (Subject s: t1.getSubjects()){
            System.out.println("--"+s.getName());
        }
        System.out.println(" ");

        Student st1 = new Student(44140981,"Nahuel Moreno");
        Student st2 = new Student(45150982,"Claudio Ruberto");
        Student st3 = new Student(45160983,"Paula Arias");
        Student st4 = new Student(46170984,"Martina Nandez");
        Student st5 = new Student(44180985,"Agustin Elias");
        Group g1  = new Group("programacion", 'A',st1);

        g1.addStudent(1,st2);
        g1.addStudent(2,st3);
        g1.addStudent(3,st4);
        g1.addStudent(4,st5);

        s1.addGroup(g1);
        s2.addGroup(g1);
        s3.addGroup(g1);

        //Ejercicio C
        System.out.println("Datos alumnos del grupo "+g1.getCourse()+" "+g1.getLetter());
        for (Student s:g1.getStudents()){
            System.out.println("Nombre: "+s.getName());
            System.out.println("DNI: "+s.getDni());
            System.out.println(" ");
        }
        System.out.println(" ");

        Group g2 = new Group("Ciencias",'A',st1);
        Group g3 = new Group("Ingenieria",'A',st1);

        st1.addGroup(g1);
        st1.addGroup(g2);
        st1.addGroup(g3);
        counter=0;

        //Ejercicio D
        System.out.println("Letra del tercer grupo del alumno "+st1.getName());
        for (Group g: s1.getGroups()){
            counter++;
            if (counter==3){
                System.out.println("Letra: "+g.getLetter());
            }
        }
        System.out.println(" ");

        //Ejercicio E

        System.out.println("Asignaturas del primer grupo del alumno "+st1.getName());
        g1.addSubject(s1);
        g1.addSubject(s2);
        counter=0;
        for (Group g: st1.getGroups()){
            counter++;
            if (counter==1){
                for (Subject s: g.getSubjects()){
                    System.out.println("--"+s.getName());
                }
            }
        }
        System.out.println("");

        //Ejercicio F

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre de la asignatura:");
        String subjectName = sc.nextLine();
        s1.addTeacher(t1);

        for (Group g : st1.getGroups()){
            for (Subject s: g.getSubjects()){
                if (s.getName().equals(subjectName)){
                    System.out.println("Profesor:"+s.getTeacher().getName());
                    break;
                }
            }
        }
        System.out.println("");

        //Ejercicio G

        t1.addSubject(s2);
        counter=0;
        System.out.println("Nombre de los alumnos del grupo de la segunda asignatura de un profesor: ");
        for (Subject s: t1.getSubjects()){
            counter++;
            if (counter==2){
                System.out.println("Profesor: "+t1.getName());
                System.out.println("Asignatura: "+s.getName());

                for (Group g: s.getGroups()){
                    System.out.println("Grupo:"+g.getCourse());
                    for (Student st: g.getStudents()){
                        System.out.println("Alumno: "+st.getName());
                    }
                }
            }
        }

    }
}
