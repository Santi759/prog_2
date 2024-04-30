package Ejercicio5;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListsTask listTask = new ListsTask();

        while (true){
            System.out.println("1. Agregar nueva tarea:");
            System.out.println("2. Eliminar tarea:");
            System.out.println("3. Mostrar tareas:");
            System.out.println("4. Salir:");
            System.out.println("Seleccione una opción: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Ingrese la descripción de la tarea:");
                    String description = sc.nextLine();
                    System.out.println("Ingrese la prioridad de la tarea:");
                    int priority =sc.nextInt();
                    sc.nextLine();
                    listTask.addTask(new Task(description,priority));
                    break;
                case 2:
                    System.out.println("Ingrese la descripción de la tarea que desea eliminar:");
                    description = sc.nextLine();
                    listTask.deleteTask(description);
                    break;
                case 3:
                    System.out.println("Todas las tareas por prioridad descendente:");
                    Iterator<Task> iterator = listTask.iterator();
                    while (iterator.hasNext()){
                        Task task = iterator.next();
                        System.out.println("Descripción:"+task.getDescription());
                        System.out.println("Prioridad: "+task.getPriority());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténte con una opción válida");
            }
        }


    }
}
