package application;

import model.entities.Cliente;

public class Program {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("Alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
