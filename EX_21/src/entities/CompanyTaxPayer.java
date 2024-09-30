package entities;

public class CompanyTaxPayer extends TaxPayer {
    
    private int numberEmployee;

    public CompanyTaxPayer() {}

    public CompanyTaxPayer(String name, double anualIncome, int numberEmployee) {
        super(name, anualIncome);
        this.numberEmployee = numberEmployee;
    }

    public int getNumberEmployee() {
        return numberEmployee;
    }

    @Override
    public double taxesPaid() {
        double tax = (numberEmployee < 10) ? getAnualIncome() * 0.16 : getAnualIncome() * 0.14;
        return tax;
    }

    @Override
    public String toString() {
        return getName() + ": " + String.format("%.2f", taxesPaid());
    }
}
