package entities;

public class Students {
    private String name;
    private double gd1;
    private double gd2;

    public String getName() {
        return name;
    }

    public double getGd1() {
        return gd1;
    }

    public double getGd2() {
        return gd2;
    }

    public Students(String name, double gd1, double gd2) {
        this.name = name;
        this.gd1 = gd1;
        this.gd2 = gd2;
    }

}
