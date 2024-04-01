public class SavingsAccount extends Account{
    protected boolean active;

    public SavingsAccount(float initialBalance, float annualRate) {
        super(initialBalance, annualRate);
        this.active = initialBalance >=10000;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    @Override
    public void allocate(float amount){
        if (active){
            balance += amount;
            depositNumber++;
        }else {
            System.out.println("La cuenta esta inactiva");
        }
    }
    @Override
    public void withdraw(float amount){
        if (active) {
            if (balance <= amount) {
                balance -= amount;
                withdrawalNumber++;
            } else {
                System.out.println("Saldo insuficiente");
            }
        }else {
            System.out.println("La cuenta esta inactiva");
        }
    }
    @Override
    public void monthlyStatement(){
        if (withdrawalNumber > 4){
            monthlyCommission +=(withdrawalNumber-4)*1000;
        }
        active = balance >=10000;
        super.monthlyStatement();
    }

    public void print(){
        super.print();
        System.out.println("Estado de la cuenta:"+(active ? "Activa":"Inactiva"));
    }



}
