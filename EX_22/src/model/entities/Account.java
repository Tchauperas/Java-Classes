package model.entities;

import model.exceptions.DomainException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {}

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }
    public String getHolder() {
        return holder;
    }
    public Integer getNumber() {
        return number;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amont) {
        balance += amont;
    }

    public void withdraw(double amount) {
        if(amount > withdrawLimit) {
            throw new DomainException("The amount exceeds withdraw limits.");
        }
        if(amount > balance) {
            throw new DomainException("Not enough balance.");
        }
        balance -= amount;
    }

    public String toString() {
        return "New balance: " + balance;
    }
}
