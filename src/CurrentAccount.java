public class CurrentAccount extends Account{
    protected  float overdraft;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = 0;
    }

    @Override
    public void allocate(float amount) {
        balance += amount;
        depositNumber++;
        if (overdraft > 0) {
            if (amount <= overdraft) {
                overdraft -= amount;
            } else {
                overdraft = 0;
            }
        }
    }
    @Override
    public void withdraw(float amount){
        balance -= amount;
        withdrawalNumber++;
        if (balance < 0){
            overdraft -= balance;
            balance = 0;
        }
    }
    public void monthlyStatement(){
        super.monthlyStatement();
    }

    public void print(){
        super.print();
        System.out.println("Sobregiro: "+overdraft);
    }
}
