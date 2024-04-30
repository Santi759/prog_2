package Ejercicio2;

public abstract class Book implements Loanable{
    private String title;
    private boolean borrowed;
    private String author;
    private int yearPublication;

    public Book() {
    }

    public Book(String title, boolean borrowed, String author, int yearPublication) {
        this.title = title;
        this.borrowed = borrowed;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }


    @Override
    public boolean borrowedBook(){
        return false;
    }

    @Override
    public boolean returnBook(){
        return true;
    }

    public void showerBook(){


        if (isBorrowed()) {
            System.out.println("Libro: " + title);
            System.out.println("Autor: " + author);
            System.out.println("Año de Publicacion: " + yearPublication);
            System.out.println("Prestado: SI");
        }else {
            System.out.println("Libro: " + title);
            System.out.println("Autor: " + author);
            System.out.println("Año de Publicacion: " + yearPublication);
            System.out.println("Prestado: NO");
        }

    }
}
