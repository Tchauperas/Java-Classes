package application;

import domain.Person;

public class Program {
    public static void main(String[] args) {
        
        Person p1 = new Person(1, "Carlos", "carlos@gmail.com");
        Person p2 = new Person(1, "Maria", "maria@gmail.com");
        Person p3 = new Person(1, "Vitor", "vitor@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
