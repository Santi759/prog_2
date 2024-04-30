package Ejercicio2;
import java.util.List;
import java.util.ArrayList;
public class Library implements Loanable{
    private List<Book> listBooks;

    public Library() {
        this.listBooks=new ArrayList<>();
    }

    public Library(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public List<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(List<Book> listBooks) {
        this.listBooks = listBooks;
    }
    public void addBook(Book book){
        this.listBooks.add(book);
    }
    public void listBook(){
        System.out.println("---Libros disponibles---");
        for (Book book : listBooks ){
            book.showerBook();
            System.out.println(" ");
        }
    }
    @Override
    public boolean borrowedBook(){
        return false;
    }
    public boolean returnBook(){
        return true;
    }
    public void toggleBookStatus(String title){
        for (Book book : listBooks){
            if (book.getTitle().equals(title)){
                book.setBorrowed(!book.isBorrowed());
                return;
            }
        }
        System.out.println("No se encontró el libro: "+title);
    }

}
