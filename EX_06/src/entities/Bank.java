package entities;

public class Bank {
    private int acc;
    private String name;
    private double value = 0;

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getAcc() {
        return acc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public void deposito(double deposito) {
        value += deposito;
    }

    public void saque(double saque) {
        value -= saque;
    }
}
