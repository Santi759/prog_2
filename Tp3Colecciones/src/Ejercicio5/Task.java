package Ejercicio5;


public class Task implements Comparable<Task>{

    private String description;
    private int priority;

    public Task() {
    }

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public int compareTo(Task anotherTask){
        return Integer.compare(anotherTask.getPriority(), this.priority);
    }

}
