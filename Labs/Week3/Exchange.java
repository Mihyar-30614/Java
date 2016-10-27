/* CSCI 1100-Lab1-Exercise 2
 This program will convert Canadia dollars to Yen then US dollars
 <Mihyar Al-Masalma> <B00759975> <10/4/2016>*/
 import java.util.Scanner; // import Scanner class 
 public class Exchange{
 	public static void main(String[] args) {
 		// create an instance of the scanner class with System.in as argument
        Scanner input = new Scanner(System.in);
        // ask the user to enter the amount of money in Canadian dollars
        System.out.println("Please type a value in $CA: ");
        // assign the inserted value to a variable
        double ca = input.nextDouble();
        // calculate how much does it worth in Yen
        double yen = ca * 77.89;
        // calculate how much does it worth in US dollar
        double us = ca * 0.76;
        // print out the result
        System.out.println(ca+" $CA = "+yen+" Yen = "+us+" $US");
 	}
 }