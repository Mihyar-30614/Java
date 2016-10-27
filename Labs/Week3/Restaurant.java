/* CSCI 1100-Lab1-Exercise 3
 This program will claculate the bill at a resturant and the tipe
 and split it evenly between the people at the table
 <Mihyar Al-Masalma> <B00759975> <10/4/2016>*/
 import java.util.Scanner; // import Scanner class 
 public class Restaurant{
 	public static void main(String[] args) {
 		// create an instance of the scanner class with System.in as argument
        Scanner input = new Scanner(System.in);
        //ask the user to enter the amount of the bill
        System.out.println("Please enter the amount of the bill $: ");
        //assign this value to a variable 
        double bill = input.nextDouble();
        // ask the user to enter how much tip does he want to pay
        System.out.println("Please enter the tip percentage (e.g., .15)$: ");
        //assign the value to a variable 
        double tip = input.nextDouble();
        // ask the user to enter the number of people on the table 
        System.out.println("Please enter the number of people dining: ");
        // assign the value to a variable 
        int people = input.nextInt();
        //calculate the total amount of the bill 
        double total = (bill * tip) + bill;
        // print out the total amount of the bill
        System.out.println("The total of your bill plus tip is $"+total);
        //calculat how much should each person pay 
        double each = total/people;
        // print out the amount each should pay
        System.out.println("Each person owes $"+each);
 	}
 }