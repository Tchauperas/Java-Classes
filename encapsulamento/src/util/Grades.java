package util;

public class Grades {
    private String name;
    private double nt1;
    private double nt2;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrades(double nt1, double nt2) {
        this.nt1 = nt1;
        this.nt2 = nt2;
    }

    public double mediaCalc() {
        return (nt1 + nt2) / 2;
    }

    public String toString() {
        return " " + mediaCalc();
    }
}
