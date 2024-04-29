package Ejercicio10;

public class UniversityTextBook extends Book{
    private String publishedUniversity;

    public UniversityTextBook() {
    }

    public UniversityTextBook(String title, String author, double price, String publishedUniversity) {
        super(title, author, price);
        this.publishedUniversity = publishedUniversity;
    }

    public String getPublishedUniversity() {
        return publishedUniversity;
    }

    public void setPublishedUniversity(String publishedUniversity) {
        this.publishedUniversity = publishedUniversity;
    }

    @Override
    public void showDates(){
        super.showDates();
        System.out.println("Universidad que lo publico: "+getPublishedUniversity());
    }
}