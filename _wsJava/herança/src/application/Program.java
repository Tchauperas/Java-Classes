package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BusinessAccount account = new BusinessAccount();
		
		System.out.println("Dados da conta: ");
		System.out.print("Id da conta: ");
		Integer number = sc.nextInt();
		System.out.print("Proprietário da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Deposito inicial: ");
		Double balance = sc.nextDouble();
		Account acc = new Account(number, holder, balance);
		
		System.out.println("Dados iniciais: ");
		System.out.println("Numero da conta: " + acc.getNumber());
		System.out.println("Proprietário da conta: " + acc.getHolder());
		System.out.println("Dinheiro na conta: " + + acc.getBalance());
		
		System.out.print("Deposito: ");
		double deposit = sc.nextDouble();
		acc.deposit(deposit);
		
		System.out.print("Saque: ");
		double withdraw = sc.nextDouble();
		acc.withdraw(withdraw);
		
		System.out.println("Dados atualizados: ");
		System.out.println("Numero da conta: " + acc.getNumber());
		System.out.println("Proprietário da conta: " + acc.getHolder());
		System.out.println("Dinheiro na conta: " + + acc.getBalance());
		
		sc.close();
	}
}
