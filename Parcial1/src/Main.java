import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        //Creamos objetos de Athlete
        Athlete ath1 = new Athlete("Foden",12345,80,23,1.85);
        Athlete ath2 = new Athlete("Sophia",85264,60,21,1.90);
        Athlete ath3 = new Athlete("Tommy",78945,80,15,1.70);
        Athlete ath4 = new Athlete("Luci",45698,42.3,20,1.75);
        Athlete ath5 = new Athlete("Martin",123879,74.3,20,1.75);

        //Cremos objetos de NationalTeam
        NationalTeam nt1 = new NationalTeam("EEUU","Rojo",null);
        NationalTeam nt2 = new NationalTeam("Argentina","Celeste",null);

        //Agregamos los atletas a los equipos nacionales
        nt1.addPlayer(ath2);
        nt1.addPlayer(ath3);
        nt2.addPlayer(ath1);
        nt2.addPlayer(ath4);
        nt1.addPlayer(ath5);

        //Creamos pruebas
        Event ev1 = new Event("Largos",1,new ArrayList<>(),null);
        Event ev2 = new Event("Lanzamiento de disco", 2, new ArrayList<>(), null);
        Event ev3 = new Event("Saltos", 3, new ArrayList<>(), null);

        //Agregamos los atletas en alguna de nuestras pruebas creadas
        ev2.addAthlete(ath2);
        ev2.addAthlete(ath3);
        ev2.addAthlete(ath5);

        //Creamos un objeto de Campus
        Campus c1 = new Campus(1,"04/05/24","9.30",new ArrayList<>(),new ArrayList<>());

        //En nuestra sede agregamos a la lista de pruebas, cada una de las pruebas
        c1.addEvent(ev1);
        c1.addEvent(ev2);
        c1.addEvent(ev3);

        //Creamos un objeto de Facility
        Facility f1 = new Facility("Atletismo","Ururguay","Largos","A",c1);

        //Agregamos la instalación en la lista de las instalaciones de la sede
        c1.addFacility(f1);

        System.out.println("---------------------------------------------------------");
        //Buscamos el nombre del tercer atleta de la segunda prueba
        f1.nameAthletethirdEvent();
        System.out.println("---------------------------------------------------------");

        System.out.println("---------------------------------------------------------");
        //Buscamos el código de la segunda prueba
        f1.codeSecondEvent();
        System.out.println("---------------------------------------------------------");

        //Creamos una lista para los jugadores de todas las selecciones nacionales
        List<NationalTeam> allTeams = new ArrayList<>();

        //Agregamos las dos selecciones a esta lista
        allTeams.add(nt1);
        allTeams.add(nt2);

        System.out.println("---------------------------------------------------------");
        //Mostramos todos los atletas de las selecciones
        NationalTeam.showAllPlayers(allTeams);
        System.out.println("---------------------------------------------------------");

        //En caso de querer mostrar los atletas de un equipo tendriamos que hacerlo de la siguiente forma nt1.showPlayers();



    }
}