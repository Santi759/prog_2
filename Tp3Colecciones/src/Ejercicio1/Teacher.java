package Ejercicio1;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashSet;
public class Teacher extends Person{
    private String department;
    private Set<Subject> subjects = new LinkedHashSet<>();

    public Teacher(int dni,String name){
        super(dni,name);
    }
    public Teacher(int dni, String name, String department, Subject subject){
        super(dni,name);
        this.department = department;
        this.subjects.add(subject);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public Set<Subject> getSubjects(){
        return subjects;
    }
    public void removeSubject(Subject subject){
        subjects.remove(subject);
    }

}
