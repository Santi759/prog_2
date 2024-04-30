package Ejercicio3;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> daysWeeks= new LinkedList<>();
        daysWeeks.add("Lunes");
        daysWeeks.add("Martes");
        daysWeeks.add("Miercoles");
        daysWeeks.add("Jueves");
        daysWeeks.add("Viernes");
        daysWeeks.add("Sabado");
        daysWeeks.add("Domingo");

        System.out.println("Días de la semana");
        for (String day : daysWeeks){
            System.out.println("--"+day);
        }

        daysWeeks.add(3,"Juernes");
        System.out.println("Días de la semana");
        for (String day : daysWeeks){
            System.out.println("--"+day);
        }
        System.out.println(" ");

        System.out.println("El día en la posición 3 es "+daysWeeks.get(2));
        System.out.println("El día en la posición 4 es "+daysWeeks.get(3));
        System.out.println(" ");

        System.out.println("Primer elemento de la lista: "+daysWeeks.get(0));
        System.out.println("Ultimo elemento de la lista: "+daysWeeks.get(daysWeeks.size()-1));
        System.out.println(" ");

        daysWeeks.remove(3);
        System.out.println("Juernes eliminado :");
        for (String day : daysWeeks){
            System.out.println("--"+day);
        }

        System.out.println("Verificar si existe un elemento Lunes:");

        boolean found = false;
        for (String day: daysWeeks){
            if (day.equals("Lunes")){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("El elemento Lunes se encuentra en la lista");
        }else {
            System.out.println("No se encontro Lunes");
        }
        System.out.println("");
        System.out.println("Verificar si existe un elemento Lunes sin importar mayúsculas o minusculas:");

         found = false;

        for (String day: daysWeeks){
            if (day.equalsIgnoreCase("LuNeS")){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("El elemento Lunes se encuentra en la lista");
        }else {
            System.out.println("No se encontro Lunes");
        }
        System.out.println("");

        System.out.println("Lista completa: ");
        for (String day : daysWeeks ){
            System.out.println(day);
        }
        daysWeeks.clear();
        System.out.println("");
        System.out.println("Lista Borrada: ");
        for (String day : daysWeeks ){
            System.out.println(day);
        }






    }
}
