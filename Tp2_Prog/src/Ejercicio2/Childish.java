package Ejercicio2;

public class Childish extends Book{
    private int pages;

    public Childish() {
    }

    public Childish(String title, boolean borrowed, String author, int yearPublication, int pages) {
        super(title, borrowed, author, yearPublication);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public void showerBook(){
        super.showerBook();
        System.out.println("Páginas: "+pages);
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
