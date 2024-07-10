package retangulo;

public class Calculo {

    public double height;
    public double width;

    public double Area() {
        return height * width;
    }

    public double Perimeter() {
        return (height * 2) + (width * 2);
    }

    public double Diagonal() {
        double ip = Math.pow(height, 2) + Math.pow(width, 2);
        return Math.sqrt(ip);
    }
}
