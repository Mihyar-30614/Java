/* CSCI 1100-Lab4-Exercise 2
 This program will read the temperture entered from a user
 then evaluate it and advise the user what to wear
 <Mihyar Al-Masalma> <B00759975> <10/11/2016>*/
import java.util.Scanner; // import Scanner class 
public class Tempreture {
	public static void main(String[] args) {
		// create an instance of the scanner class with System.in as argument
		Scanner input = new Scanner(System.in);
		// Ask the user to enter temperture in Celsius
		System.out.print("Please type the temperture in Celsius: ");
		// Store the value the user entered in a variable
		int temp = input.nextInt();
		// Evaluate if the value is less than 10
		if(temp<10){
			// if less than 10 then print this 
			System.out.println("You should wear a jacket - it's cold out!");
		}else{
			// if not print this
			System.out.println("You should take a sweater");
		}
	}
}