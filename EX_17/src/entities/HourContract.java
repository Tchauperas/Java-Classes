package entities;

import java.sql.Date;

public class HourContract {

    private Date date;
    private double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }
    public Integer getHours() {
        return hours;
    }
    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }

}
