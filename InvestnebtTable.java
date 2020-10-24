// Toru Hirano, lab section 1

import java.util.Scanner;

public class InvestnebtTable {
	public static double newBalance(double oldBalance, double totalPayments, double interestRate) {
		if(oldBalance <= totalPayments * 12) return 0;
		oldBalance -= totalPayments * 12;
		return oldBalance * (1 + interestRate/100);
	}
	public static void main(String args[]) {
		double amount, interest, payment;
		
		// Set a scanner total amount
		Scanner scnr = new Scanner (System.in);
		System.out.println( "totall amount:" );
		
		// Set a scanner monthly payment
		amount = scnr.nextDouble();
		System.out.println( "monthly payment:" );
	
		// Set a scanner interest rate, in percent
		payment = scnr.nextDouble();
		System.out.println( "interest rate, in percent:" );
		
		interest = scnr.nextDouble();
		int year = 1;
		
		do {
			amount = newBalance(amount, payment, interest);
			System.out.printf ( "%d %.2f\n" , year , amount);
			year ++;
		}while(amount > 0 && year <= 10);
		scnr.close();
		}
		
	}
