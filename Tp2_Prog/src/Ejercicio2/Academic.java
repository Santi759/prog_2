package Ejercicio2;

public class Academic extends Book{
    private String subject;

    public Academic() {
    }

    public Academic(String title, boolean borrowed, String author, int yearPublication, String subject) {
        super(title, borrowed, author, yearPublication);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public void showerBook(){
        super.showerBook();
        System.out.println("Materia: "+subject);
    }
    @Override
    public boolean borrowedBook(){
        return false;
    }

    @Override
    public boolean returnBook(){
        return true;
    }
}
