package Ejercicio1;
import java.util.Set;
import java.util.LinkedHashSet;
public class Group {
    private String course;
    private char letter;
    private Student students[]= new Student[5];

    private Set<Subject> subjects = new LinkedHashSet<>();

    public Group(String course, char letter, Student student){
        this.course = course;
        this.letter = letter;
        this.students[0] = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Student[] getStudents() {
        return students;
    }

   public void addStudent(int position, Student student){
        if (position>-1 && position<5){
            if (students[position]== null){
                students[position]= student;
            }
        }
   }
   public Set<Subject>getSubjects(){
        return subjects;
   }
   public void addSubject(Subject subject){
       subjects.add(subject);
   }
}
