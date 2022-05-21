package entities;

import entities.exceptions.DomainExceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance, withDrawLimit;

    public void deposit(double amount) {
        balance += amount;
    }
    public void withDraw(double amount) {
        if (amount > withDrawLimit) {
            throw new DomainExceptions("O limite de saque não permite esta operação.");
        } else if (balance < amount) {
            throw new DomainExceptions("Você não tem saldo em conta para realizar esta operação.");
        }
        balance -= amount;
        System.out.println("New balance: " + balance);
    }

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

}
