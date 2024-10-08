package model.entities;

public class Invoice {
    
    private Double basicPayment;
    private Double tax;

    private Invoice() {}

    private Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }
    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }

    public double totalPayment() {
        return getBasicPayment() + getTax();
    }
}
