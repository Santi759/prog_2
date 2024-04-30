package Ejercicio5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListsTask implements Iterable<Task>{

    private List<Task> tasks;

    public ListsTask() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
        Collections.sort(tasks);
    }

    public void deleteTask(String description){
        Task taskDelete = null;
        for (Task task: tasks){
            if (task.getDescription().equals(description)){
                taskDelete = task;
                break;
            }
        }
        if (taskDelete != null){
            tasks.remove(taskDelete);
        }
    }

    public int obtainNumberTotalTasks(){
        return tasks.size();
    }

    @Override
    public  Iterator<Task> iterator() {
        return tasks.iterator();
    }
}
