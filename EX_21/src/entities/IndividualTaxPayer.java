package entities;

public class IndividualTaxPayer extends TaxPayer {

    private double healthExp;

    public IndividualTaxPayer() {}

    public IndividualTaxPayer(String name, double anualIncome, double healthExp) {
        super(name, anualIncome);
        this.healthExp = healthExp;
    }

    public double getHealthExp() {
        return healthExp;
    }

    @Override
    public double taxesPaid() {
        return 0;
    }
}