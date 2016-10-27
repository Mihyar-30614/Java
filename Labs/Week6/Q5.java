/*CSCI 1100 – Lab 6 – Excercise 5
   This program will take an integer then 
   gives back the the sequence of multiples untill it reaches
   num * num
<Mihyar Al-Masalma> <B00759975>  <25 Oct 2016> */
import java.util.Scanner; // import Scanner Class
public class Q5 {
	public static void main(String[] args) {
		int counter = 1;
		double total = 0, taxed = 0;
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter the number of items
		System.out.print("Please enter the number of items in the bill: ");
		// Store the value in a variable]
		int items = input.nextInt();
		// Consume the rest of the line
		input.nextLine();
		// Ask the user for the tax rate 
		System.out.print("Please enter the tax rate: %");
		// Store the value in a variable 
		int tax = input.nextInt();
		// consume the rest of the line
		input.nextLine();
		// loop to get the prices
		while (counter <= items){
			// Ask the user to enter the price
			System.out.print("Enter the cost of item "+counter+": ");
			// Add the price to the total
			total += input.nextDouble();
			// Consume the rest of the line
			input.nextLine();
			// Increase the counter by one
			counter++;
		}
		// Print out the total without taxes
		System.out.println("Total (before tax):\t  $"+total);
		// Calculate the tax
		taxed = (total*tax)/100;
		// Print out how much is the tax
		System.out.println("Total tax ("+tax+"%):\t  $"+taxed);
		// Print out the total with taxes
		System.out.println("Final Total: \t\t  $"+(total+taxed));
	}
}