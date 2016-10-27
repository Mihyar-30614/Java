/*CSCI 1100 – Lab 5 – Excercise 3
   This program will translate the number to a province longer equivalency
<Mihyar Al-Masalma> <B00759975>  <18 Oct 2016> */
import java.util.Scanner;  // import Scanner Class
public class Q3 {
	public static void main(String[] args) {
		
		// Create instance of Scanner Class
		Scanner input = new Scanner(System.in);
		// Ask the user to input the number
		System.out.print("Please input the province code: ");
		// Store it in a variable 
		int prov = input.nextInt();
		// See if the number is one
		if (prov == 1) {
			// if it was one then print out Nova Scotia
			System.out.println("You have chosen Nova Scotia");
		}else if (prov == 2) {
			// if the number is 2 then it is New Brunswick
			System.out.println("You have Chosen New Brunswick");
		}else if (prov == 3) {
			// if the number is 3 then it is Prince Edward Island
			System.out.println("You have Chosen Prince Edward Island");
		}else if (prov == 4) {
			// if the number is 4 then it is Newfoundland and Labrador
			System.out.println("You have Chosen Newfoundland and Labrador");
		}else{
			// if it is something else print out not valid 
			System.out.println("Not Valid input");
		}
	}
}