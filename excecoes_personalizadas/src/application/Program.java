package application;

import java.util.Scanner;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;

import model.entities.Reservation;
import model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int rn = sc.nextInt();
            System.out.print("Check-in date (DD/MM/YYYY): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (DD/MM/YYYY): ");
            Date checkOut = sdf.parse(sc.next());
        
            Reservation reserv = new Reservation(rn, checkIn, checkOut);
            System.out.println("Reservation: " + reserv);

            System.out.println();
            System.out.println("Enter date of reservation: ");
            System.out.print("Check-in date (DD/MM/YYYY): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (DD/MM/YYYY): ");
            checkOut = sdf.parse(sc.next());
        
            reserv.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reserv);
        } catch(ParseException e) {
            System.out.println("Invalid date format.");
        } catch(DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid room number");
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}