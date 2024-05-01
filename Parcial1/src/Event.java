import java.util.List;
import java.util.ArrayList;
public class Event {

    //Creamos los métodos de la clase Event, dando a entender que cada Prueba tendra un titulo, un codigo, una lista de atletas y una sede
    private String title;
    private int code;
    private List<Athlete> athletes;
    private Campus campus;

    //Creamos sus contructores con sus getters and setters
    public Event() {
    }

    public Event(String title, int code, List<Athlete> athletes, Campus campus) {
        this.title = title;
        this.code = code;
        this.athletes = new ArrayList<>();
        this.campus = campus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public void addAthlete(Athlete athlete){
        athletes.add(athlete);
    }

    }

