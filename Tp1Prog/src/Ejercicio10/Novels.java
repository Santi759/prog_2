package Ejercicio10;

public class Novels extends Book{
    private String type;

    public Novels() {
    }

    public Novels(String title, String author, double price, String type) {
        super(title, author, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showDates(){
        super.showDates();
        System.out.println("Tipo de libro: "+getType());
    }
}
