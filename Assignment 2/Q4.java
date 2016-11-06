/* Assignment2 Question 4
This program will take a number of goodies then
calculate how much shipping you should pay and the total 
<CSCI 1100><Mihyar Al-Masalma><B00759975>*/
import java.util.Scanner; // import Scanner class
public class Q4 {
	public static void main(String[] args) {
		double price = 0, fees = 0, shippingFees = 0, total = 0;
		String shipping = ""; int counter = 1; 
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a number and save it
		System.out.print("Enter the number of pairs of shoes: ");
		int number = input.nextInt();
		// Iterate to get the prices and Store it in a variable
		while (number >= counter) {
			System.out.printf("Enter the price of pair%d : $", counter);
			price += input.nextDouble();
			counter++;
		}
		// Consume the rest of the line
		input.nextLine();
		// Iterate till the user enter valid Shipping destination
		while (!shipping.equals("Nova Scotia") && !shipping.equals("Canada") && !shipping.equals("Other")) {
			System.out.println("Where you would like to ship your shoes:");
			System.out.print("Nova Scotia, Canada or Other: ");
			shipping = input.nextLine();
		}
		// Print out in formated way the cost of the shoes
		System.out.printf("Total Cost for all Shoes: $ %.2f",price);
		// Based on the price, calculate the shipping fees
		if (price < 100) {
			fees = price * 0.25;
		}else if (price < 200) {
			fees = price * 0.15;
		}else if (price > 200) {
			fees = price * 0.10;
		}
		// Print out the shipping fees
		System.out.printf("\nShipping Fee on Order Amount: $ %.2f", fees);
		// based on the destination calculate the fees
		if (shipping.equals("Canada")) {
			shippingFees = 25;
		}else if (shipping.equals("Other")) {
			shippingFees = 50;
		}
		// print out the result in a formated way
		System.out.printf("\nShipping Fee on Destination: $ %.2f", shippingFees);
		total = price + fees + shippingFees;

		System.out.printf("\nTOTAL COST OF ORDER: $ %.2f", total);
	}
}