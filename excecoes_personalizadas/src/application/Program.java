package application;

import java.util.Scanner;
import java.util.Date;
import java.util.Locale;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int rn = sc.nextInt();
        System.out.print("Check-in date (DD/MM/YYYY): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out date (DD/MM/YYYY): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reserv = new Reservation(rn, checkIn, checkOut);
            System.out.println("Reservation: " + reserv);

            System.out.println();
            System.out.println("Enter date of reservation: ");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkOut = sdf.parse(sc.next());

            
            String error = reserv.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reserv);
            }
            System.out.println("Reservation: " + reserv);
            

        }

        sc.close();
    }
}