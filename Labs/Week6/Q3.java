/*CSCI 1100 – Lab 6  – Excercise 3
   This program will calculate the increase cost of the car
   over the entered number of years
<Mihyar Al-Masalma> <B00759975>  <25 Oct 2016> */
import java.util.Scanner; // import Scanner class
public class Q3 {
	public static void main(String[] args) {
		int date = 2016;
		double cost = 25000;
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a number 
		System.out.print("Please type a number of years: ");
		// Store the value the user entered
		int years = date + input.nextInt();
		// Consume the rest of the line
		input.nextLine();
		// Loop till the end year
		while (date<years){
			// Print out the price and the year
			System.out.println("Year: "+date+"- Cost "+cost);
			// Calculate the cost of the car
			cost += cost * 0.065;
			// Increase the date by one
			date++;
		}
	}
}