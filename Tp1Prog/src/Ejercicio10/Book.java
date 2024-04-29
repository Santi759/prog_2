package Ejercicio10;

public abstract class Book{
    protected String title;
    protected String author;
    protected double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showDates(){
        System.out.println("Titulo: "+title);
        System.out.println("Autor: " +author);
        System.out.println("Precio: $"+price);
    }
}