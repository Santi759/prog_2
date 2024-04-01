// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SavingsAccount sa1 = new SavingsAccount(15000,5);
        sa1.allocate(5000);
        sa1.withdraw(2000);
        sa1.withdraw(2000);
        sa1.withdraw(2000);
        sa1.withdraw(2000);
        sa1.monthlyStatement();
        sa1.print();

        System.out.println("");

        CurrentAccount ca1 = new CurrentAccount(5000,3);
        ca1.allocate(2000);
        ca1.withdraw(8000);
        ca1.monthlyStatement();
        ca1.print();


        }
    }
