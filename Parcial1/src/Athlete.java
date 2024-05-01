//importamos la interfaz Math para usarla más adelante
import java.lang.Math;

//Heredamos la clase Person y implementamos la interfaz Contract
public class Athlete extends Person implements Contract{

    //Métodos propios de la clase Athlete, algunos de estos metodos se usaran para devolver valores
    private double weight;
    private int age;
    private double height;

    //Creamos sus constructores con sus getters and setters
    public Athlete() {
    }

    public Athlete(String name, int dni, double weight, int age, double height) {
        super(name, dni);
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //Implementamos los métodos de la interfaz Contract
    //CalculateIMC se usara para calcular el indice de la masa corporal de cada atleta
    @Override
    public double calculateIMC(){
        return weight/Math.pow(height,2);
    }

    //thereExtraWeight recibira el IMC y verificara si el atleta tiene peso extra (el peso normal-saludable es de 18.5 a 24.9), si tiene más del peso normal será peso extra
    //Devolvera False en caso de no tener peso extra pero si el atleta pasa el peso normal devolvera True
    @Override
    public boolean thereExtraWeight() {
        double imc = calculateIMC();
        if (imc > 24.9) {
            return true;
        }
        {
            return false;
        }
    }

    //Este método simula las pulsaciones de un Atleta que normalmente son entre 60 y 100
    //Usamos Math.random para darnos un valor entre estos
    @Override
    public double takePulses(){
        return Math.random()*(10-60)+60;
    }
}
