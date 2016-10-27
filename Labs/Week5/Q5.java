/*CSCI 1100 – Lab 5 – Excercise 5
   This program will take the user lab, assignment and test results 
   if the lab mark is higher than assignment it will be ignored and 50% 
   will go to test and 50% to assignments, otherwise it is 50% tests
   25% labs and 25% assignment. then the program print out the final grade as 
   a letter
<Mihyar Al-Masalma> <B00759975>  <18 Oct 2016> */
import java.util.Scanner;  // import Scanner Class
public class Q5 {
	public static void main(String[] args) {
		double total = 0; char grade = ' ';
		// Create an instance of the Scanner Class
		Scanner input = new Scanner(System.in);
		// Ask the user to enter his assignment mark 
		System.out.print("Please enter your assignments mark: ");
		// Store the value in a variable 
		double assignment = input.nextDouble();
		// Ask the user to enter his test results 
		System.out.print("Please enter your tests results: ");
		// Store it in a variable 
		double test = input.nextDouble();
		// Ask the user to enter his labs mark
		System.out.print("Please enter your lab mark: ");
		// Store the value the user entered
		double lab = input.nextDouble();
		// Compare the lab and assignment marks
		if (lab > assignment) {
			// if lab mark is greater than assignment mark
			total = (test*.5) + (assignment*.5);
		}else{
			// if assignment mark is greater than lab mark
			total = (test*.5) + (lab*.25) + (assignment*.25);
		}
		// if total mark is greater or equal 80
		if (total >= 80) {
			// the garde is A
			 grade = 'A';
			// if total is more than 70
		}else if (total >= 70) {
			// grade is B
			 grade = 'B';
			// if total is more than 60
		}else if (total >=60) {
			// grade is C
			 grade = 'C';
			// if total is more than 50
		}else if (total >= 50) {
			// total is D
			 grade = 'D';
			// if either
		}else{
			// grade is F
			 grade = 'F';
		}
		// print out the resutl 
		System.out.println("Your final grade is :" + grade);
	}
}