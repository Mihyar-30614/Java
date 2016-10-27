/*CSCI 1100 – Lab 6 – Excercise 1
   This program will take an integer between 1 and 5
and the names of two cities, if the number is odd
it will print the name of the first city n times, 
if the number is even it will print the name of the 
2nd city n times
<Mihyar Al-Masalma> <B00759975>  <25 Oct 2016> */
import java.util.Scanner; // import java Scanner
public class Q1 {
	public static void main(String[] args) {
		// Create an instance of the scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter a number
		System.out.print("Please type a number between 1 and 5: ");
		// Store the number in a variable
		int num = input.nextInt();
		// consume the rest of the line 
		input.nextLine();
		// Ask the user to enter the name of the cities
		System.out.print("Please type two cities: ");
		// Store the names in a variable
		String cities = input.nextLine();
		// Split the string based on space and store it in array
		String[] splitedCities = cities.split(" ");
		// Ckeck the number
		if (num%2 == 0) {
			// if number is even; loop as long as num is more than 0
			while (num>0){
				// Print out the name of the city
				System.out.println(splitedCities[1]);
				// Decrease the value of number by one
				num--;
			}
			// if number is odd
		}else{
			// Loop as long as num is more than 0
			while (num>0){
				// Print out the name of the first city
				System.out.println(splitedCities[0]);
				// decrease the value of the number by one
				num--;
			}
		}
	}
}