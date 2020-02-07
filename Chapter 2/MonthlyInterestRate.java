/*
Author: Jordan Ruesch
Date: 2/5/2020
Exercise 2-1 to convert celsius to fahrenheit
*/
import java.util.Scanner;
class MonthlyInterestRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double MonthlyInterestRate = 0.00417;
		System.out.print("Enter the monthly saving amount: ");
		double SavingAmount = input.nextDouble();
		double total = 100 * (1 + MonthlyInterestRate);
		total = (100 + total) * (1 + MonthlyInterestRate);
		total = (100 + total) * (1 + MonthlyInterestRate);
		total = (100 + total) * (1 + MonthlyInterestRate);
		total = (100 + total) * (1 + MonthlyInterestRate);
		total = (100 + total) * (1 + MonthlyInterestRate);
		System.out.println("After the sixth month, the account value is " + total);
	}
}