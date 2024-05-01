import java.util.List;
import java.util.ArrayList;
public class Facility {

    //Creamos una clase Facility, dando a entender que cada instalación tendra una categoria, una localización, un nombre y esta relacionado con sede, entonces cada sede tendra una instalacion y cada instalción una sede
    private String category;
    private String location;
    private String name;
    private String type;

    private Campus campus;

    //Creamos sus constructores y getters and setters
    public Facility() {
    }

    public Facility(String category, String location, String name, String type, Campus campus) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        this.campus = campus;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    //por medio de la relación entre la clase Facility y la clase Campus mostramos el nombre del tercer atleta de la segunda prueba
    public void nameAthletethirdEvent() {
        campus.getNameThirdEvent();
    }

    //por medio de la relación entre la clase Facility y la clase Campus mostramos el código de la segunda clase
    public void codeSecondEvent(){
        campus.codeSecondEvent();
        }
    }
