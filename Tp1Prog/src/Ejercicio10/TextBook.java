package Ejercicio10;

public class TextBook extends Book{
    private String AssociatedCourses;

    public TextBook() {
    }

    public TextBook(String title, String author, double price, String associatedCourses) {
        super(title, author, price);
        AssociatedCourses = associatedCourses;
    }

    public String getAssociatedCourses() {
        return AssociatedCourses;
    }

    public void setAssociatedCourses(String associatedCourses) {
        AssociatedCourses = associatedCourses;
    }
    @Override
    public void showDates(){
        super.showDates();
        System.out.println("Curso Asociado: "+getAssociatedCourses());
    }
}
