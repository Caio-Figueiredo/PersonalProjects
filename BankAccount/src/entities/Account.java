package entities;

public class Account {

    private static double TAX = 5;
    private String name;
    private double balance;
    private Integer accountNumber;

    public void deposit(double value){

        balance += value;

    }

    public void withDraw(double value){

        balance = balance - TAX - value;

    }

    public Account(String name, Integer accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String name, Integer accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", "
                + "Holder: "
                + name
                + ", "
                + "Balance: $ "
                + String.format("%.2f", balance) + "\n";
    }
}
