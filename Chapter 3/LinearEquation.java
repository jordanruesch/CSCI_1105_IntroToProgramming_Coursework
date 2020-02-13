/*
Author: Jordan Ruesch
Date: 2/12/2020
Exercise 2-1 to convert celsius to fahrenheit
*/
import java.util.Scanner;
class LinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		System.out.print("Enter d: ");
		double d = input.nextDouble();
		System.out.print("Enter e: ");
		double e = input.nextDouble();
		System.out.print("Enter f: ");
		double f = input.nextDouble();
		if (a * d - b * c == 0){
			System.out.println("The equation has no solution");
		}
		else {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x = " + x + " y = " + y);
		}
	}
}