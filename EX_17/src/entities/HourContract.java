package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
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
    public Double getValuePerHour() {
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
