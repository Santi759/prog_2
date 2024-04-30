package Ejercicio1;
import java.util.Set;
import java.util.LinkedHashSet;
public class Subject {

    private String name;
    private int classroom;
    private String hour;
    private  Teacher teacher;
    private Set<Group> groups = new LinkedHashSet<>();


    public Subject(String name, int classroom, String hour){
        this.name = name;
        this.classroom = classroom;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

  public void addTeacher(Teacher teacher){
        this.teacher = teacher;
  }
  public Teacher getTeacher(){
      return teacher;
  }
  public Set<Group> getGroups(){
        return groups;
  }
  public void addGroup(Group group){
        groups.add(group);
  }

  public void removeTeacher(){
        this.teacher = null;
  }
  public void removeGroup(Group group){
        for (Group g : groups){
            if (g == group){
                groups.remove(g);
            }else {
                System.out.println("Grupo no encontrado");
            }
        }
  }
}
