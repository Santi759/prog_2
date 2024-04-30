package Ejercicio2;

public class Novel extends Book{
    private String gender;

    public Novel() {
    }

    public Novel(String title, boolean borrowed, String author, int yearPublication, String gender) {
        super(title, borrowed, author, yearPublication);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void showerBook(){
        super.showerBook();
        System.out.println("Genero: "+gender);
    }
    @Override
    public boolean borrowedBook(){
        return true;
    }

    @Override
    public boolean returnBook(){
        return false;
    }
}
