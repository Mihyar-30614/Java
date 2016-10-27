/* CSCI 1100-Lab1-Exercise 5
This program will take the user name and his marks and give back his final mark 
 <Mihyar Al-Masalma> <B00759975> <10/4/2016>*/
 import java.util.Scanner; // import Scanner class 
 public class Grades {
 	public static void main(String[] args) {
 		// create an instance of the scanner class with System.in as argument
        Scanner input = new Scanner(System.in);
        // ask the user to enter his name 
        System.out.println("Please enter your name: ");
        // assign the entered value to a variable 
        String name = input.nextLine();
        // ask the user to enter his exam mark 
        System.out.println("Please enter your exam mark: ");
        // assign the entered value to a variable 
        double exam = input.nextDouble();
        // ask the user for the assignment mark 
        System.out.println("Please enter your assignment mark: ");
        // assign the entered value to a variable 
        double assignment =  input.nextDouble();
        // ask the user to enter his lab mark 
        System.out.println("Please enter your lab mark: ");
        // assign the value to a variable 
        double lab = input.nextDouble();
        // calculate the marks 
        exam = exam * .60;
        assignment = assignment * .30;
        lab = lab * .10;
        double result = exam + assignment + lab;
        // print out the final result 
        System.out.println("Final grade:  "+result+"%");
 	}
 }