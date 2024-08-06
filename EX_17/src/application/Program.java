package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter departament's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));

        System.out.print("How many contracts to this worker: ");
        int n = sc.nextInt();

        for(int i = 0; n < 0; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            
        }

        sc.close();
    }    
}
