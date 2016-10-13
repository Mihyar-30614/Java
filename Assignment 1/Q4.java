/*
Thiss program should take a ticket price, tax, discount and 
if the passenger is a child or senior citizen and then return 
how much the passenger have to pay.
*/
import java.util.Scanner; //import Scanner Class
public class Q4 {
	public static void main(String[] args) {
		// Define varirables to use later
		double discount = 0, newPrice, tax, total;
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the price of the flight
		System.out.print("Enter the price of the flight: $");
		// Store the value in a variable called ticket
		double ticket = input.nextDouble();
		// Ask the user to enter the tax rate
		System.out.print("Enter the tax rate: %");
		// Store the value in variable called taxPercentage
		double taxPercentage = input.nextDouble();
		// Ask the user to choice the category
		System.out.print("Enter 1 for student, 2 for senior, or 3 for neither: ");
		// store the value in a variable called choice
		int choice = input.nextInt();
		// to consume what is left of the line
		input.nextLine();
		// Evaluate the user choice
		if (choice == 1) {
			// if student then discount is 20%
			discount = ticket * 0.20;
		}else if(choice == 2){
			// if senior then discount is 10%
			discount = ticket * 0.10;
		}
		// if neither discount is 0 which we already initiate with
		// compute the new price after discount
		newPrice = ticket - discount;
		// Calculate the tax
		tax = newPrice / taxPercentage;
		// Calculate how much the client should pay
		total = newPrice + tax;
		// print out the results 
		System.out.println("Discount on price of ticket: $"+discount);
		System.out.println("Price of ticket (after discount): $"+newPrice);
		System.out.println("Tax: $"+tax);
		System.out.println("Total: $"+total);
	}
}