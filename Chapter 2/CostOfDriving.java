/*
Author: Jordan Ruesch
Date: 2/11/2020
Exercise 2-1 to convert celsius to fahrenheit
*/
import java.util.Scanner;
class CostOfDriving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print(" Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		double costOfDriving = (distance / milesPerGallon * pricePerGallon);
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}