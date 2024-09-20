package entities;

public abstract class TaxPayer {

    private String name;
    private double anualIncome;

    public TaxPayer() {}

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public double getAnualIncome() {
        return anualIncome;
    }
    public String getName() {
        return name;
    }

    public abstract double taxesPaid(); 
}
