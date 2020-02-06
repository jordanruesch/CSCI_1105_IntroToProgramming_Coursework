/*
Author: Jordan Ruesch
Date: 2/5/2020
Exercise 2-1 to convert celsius to fahrenheit
*/
import java.util.Scanner;
class CelsiustoFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in celsius:");
		double celsius = input.nextDouble();
		double fahrenheit = 9.0 / 5 * celsius + 32;
		System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit ");
	}
}