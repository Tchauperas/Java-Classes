package entities;

public class Grades {
    public String name;
    public double nt1;
    public double nt2;
    public double nt3;
    public double total;

    public double student(double x, double y, double z) {
        return total = x + y + z;
    }

    public String toString() {
        if(total >= 54) {
            return "FINAL GRADE: " + String.format("%.2f", total) + "\n" + "PASS";
        } else {
            double miss = 60 - total;
            return "FINAL GRADE: " + String.format("%.2f", total) + "\n" + "FAILED" + "\n" + "MISSING POINTS: " + miss;
        }
    }
}
