import java.util.List;
import java.util.ArrayList;
public class Campus {
    //Creamos una clase Campus, con sus atributos. Cada sede tendrá una fase, una fecha, un horario, una lista de eventos y una lista de instalaciones
    private int phase;
    private String date;
    private String hour;
    private List<Event> events;
    private List<Facility> facilities;

    //Creamos sus constructores con sus getters and setters
    public Campus() {
    }

    public Campus(int phase, String date, String hour, List<Event> events, List<Facility> facilities) {
        this.phase = phase;
        this.date = date;
        this.hour = hour;
        this.events = new ArrayList<>();
        this.facilities = new ArrayList<>();
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    //Este método nos permitira agregar pruebas a la sede
    public void addEvent(Event event) {
        this.events.add(event);
    }

    //Este método nos permitira agregar instalaciones a la sede
    public void addFacility(Facility facility) {
        this.facilities.add(facility);
    }

    //Este método servira para encontrar el tercer atleta de la segunda prueba
    public void getNameThirdEvent(){
        //Creamos contadores para prueba y para atletas, asi verificaremos que sea la segunda prueba y el tercer atleta
        int countEvent = 0;
        int countAthletes=0;
        //Creamos dos variables boolean para poder identificar si existe una segunda prueba y si en la segunda prueba se encuentra un tercer atleta
        boolean findAthlete = false;
        boolean findEvent = false;
        //Iteramos sobre la lista de pruebas
        for (Event event:events){
            //Si el contador se encuentra en 1, significa que la sede tiene una segunda prueba, esto significa que entraremos en el condicional
            if (countEvent==1){
                //Iteramos sobre la lista de de atletas que tiene esa prueba
                for (Athlete athlete: event.getAthletes()){
                    //si el contador de atletas(countAthletes) se encuentra en 2, el programa entrara en el condicional, esto significa que hemos encontrado un tercer atleta en la segunda prueba
                    if (countAthletes==2){
                        //Imprimimos su nombre
                        System.out.println("Nombre del tercer atleta :"+athlete.getName());
                        System.out.println("");
                        //cambiamos la variable de false a true, dando a entender que el atleta ha sido encontrado
                        findAthlete=true;
                        //salimos del iterador
                        break;
                    }
                    //El contador por cada iteración sumara de a 1
                    countAthletes++;
                }
                //En caso de que la condición no haya sido cierta, y la variable findAthlete siga siendo falsa entrará en el siguiente condicional

                if (!findAthlete){
                    //Imprimira un mensaje dando a entender que en la segunda prueba no hay tres atletas
                    System.out.println("No se encontro un tercer atleta en la segunda prueba");
                }
                //Si el condicional que evalua la condición de que exista una segunda prueba, se cumple, la variable findEvent, cambiara su estado a Verdadero, dando a entender que existe una segunda prueba

                findEvent=true;
                }

            countEvent++;
            }
        //Si la variable findEvent sigue siendo false, significa que no encontro una segunda prueba y nos mostrara por pantalla que no existe una segunda prueba
        if (!findEvent){
            System.out.println("No se encontro una segunda prueba");
        }
        }


        //Creamos un método para extraer el código de la segunda prueba
    public void codeSecondEvent() {
        //creamos un contador para verficar que nos encontremos en la segunda prueba
        int count = 0;
        //una variable de tipo booleano para mostrarnos por pantalla si no se encontro una segunda prueba
        boolean find = false;
        //Iteramos sobre las pruebas
        for (Event event : events) {
            //Si el contador es igual a 1, significa que se encontro una segunda prueba
            if (count == 1) {
                //Extraemos el código de la segunda prueba y lo imprimimos por pantalla
                int code = event.getCode();
                System.out.println("Codigo de la segunda prueba:" + code);
                System.out.println("");
                //Cambiamos el estado de la variable find para que no muestre por pantalla que no se encontro la segunda prueba
                find= true;
                break;
            }
            count++;
        }
        //En caso de qye find sea false nos mostrara que la segunda prueba no se encontro
        if (!find){
            System.out.println("No se encontro una segunda prueba");
        }
    }
}

