public abstract class Account {
    protected float balance;
    protected int depositNumber;
    protected int withdrawalNumber;
    protected float annualRate;
    protected float monthlyCommission;

    public Account(float initialBalance, float annualRate) {
        this.balance = initialBalance;
        this.annualRate = annualRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(int depositNumber) {
        this.depositNumber = depositNumber;
    }

    public int getWithdrawalNumber() {
        return withdrawalNumber;
    }

    public void setWithdrawalNumber(int withdrawalNumber) {
        this.withdrawalNumber = withdrawalNumber;
    }

    public float getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(float annualRate) {
        this.annualRate = annualRate;
    }

    public float getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setMonthlyCommission(float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }

    public abstract void allocate(float amount);
    public abstract void withdraw(float amount);
    public void calculateInterestMonthly(){
        float monthlyInterest = balance*(annualRate/12)/100;
        balance += monthlyInterest;
    }
    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterestMonthly();
    }
    public void print(){
        System.out.println("Saldo: " + balance);
        System.out.println("Comisión mensuales: " + monthlyCommission);
        System.out.println("Movimientos: " + (depositNumber+withdrawalNumber));
    }


}
