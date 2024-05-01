//Importamos colecciones para hacer listas de Atletas
import java.util.ArrayList;
import java.util.List;
public class NationalTeam {

    //Cada equipo nacional contara con su nombre del País y un color representando su bandera, además tendrá una lista de Atletas
    private String country;
    private String color;
    private List<Athlete> athletes;

    //Creamos sus contructores y sus getters and setters
    public NationalTeam() {
    }

    public NationalTeam(String country, String color, List<Athlete> athletes) {
        this.country = country;
        this.color = color;
        this.athletes = new ArrayList<>();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    //Este método sirve para agregar atletas a la selección nacional
    public void addPlayer(Athlete athlete){
        athletes.add(athlete);
    }

    //Con este método podemos eliminar jugadores de nuestra seleccion
    public void removePlayer(Athlete athlete){
        athletes.remove(athlete);
    }

    //Este método mostrara los jugadores (Solo su nombre y altura) de un país y mostrara si el atleta tiene peso extra, si tiene menos del peso normal o si su peso esta normal
    public void showPlayers(){
        //Recorremos la lista de atltetas que conforman un país
        for (Athlete athlete:athletes){
            System.out.println("Nombre: "+athlete.getName());
            System.out.println("Altura: "+athlete.getHeight());
            System.out.println("");
            //Si el método thereExtraWeight, de la clase Athlete, es True nos dira cuanto peso extra tiene el atleta
            if (athlete.thereExtraWeight()){
                double imc=athlete.calculateIMC();
                double amountExtraWeight = imc-24.9;
                System.out.println("Tiene "+amountExtraWeight+ "kg de peso extra");
                System.out.println("");
            //Si el IMC del atleta es menor a 18.5, el programa nos mostrara que esta por debajo del peso normal y cuanto de peso menos tiene
            }else if (athlete.calculateIMC()<18.5){
                double imc= athlete.calculateIMC();
                double amountWeightLess = 18.5-imc;
                System.out.println("Tiene "+amountWeightLess+ "kg de peso menos");
                System.out.println("");
            //Si el método de la clase Athlete, thereExtraWeight, es False, el programa indicara que su peso es normal
            }else {
                System.out.println("Tiene un peso normal - saludable");
                System.out.println("");
            }
        }
    }


    //Este método es igual al anterior con la diferencia que nos muestra todos los atletas relacionados con algun Equipo Nacional
    public static void showAllPlayers(List<NationalTeam> teams) {
        for (NationalTeam team : teams) {
            System.out.println("País: " + team.getCountry());
            System.out.println("Color: " + team.getColor());
            System.out.println("Atletas:");
            for (Athlete athlete : team.getAthletes()) {
                System.out.println("   Nombre: " + athlete.getName());
                System.out.println("   Altura: " + athlete.getHeight());
                System.out.println("");
                if (athlete.thereExtraWeight()) {
                    double imc = athlete.calculateIMC();
                    double amountExtraWeight = imc - 24.9;
                    System.out.println("   Tiene " + amountExtraWeight + " kg de peso extra");
                    System.out.println("");
                } else if (athlete.calculateIMC() < 18.5) {
                    double imc = athlete.calculateIMC();
                    double amountWeightLess = 18.5 - imc;
                    System.out.println("   Tiene " + amountWeightLess + " kg de peso menos");
                    System.out.println("");
                } else {
                    System.out.println("   Tiene un peso normal - saludable");
                    System.out.println("");
                }
            }
        }
    }
}
