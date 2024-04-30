package Ejercicio1;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashMap;
public class Student extends Person{
    private Set<Group> groups = new LinkedHashSet<>();
    public Student(int dni, String name){
        super(dni,name);
    }
    public Set<Group>getGroups(){
        return groups;
    }
    public void addGroup(Group group){
        groups.add(group);
    }
}
