/*
this program will ask a user to enter different information then 
print out a story made of these information
*/
import java.util.Scanner; // Import Scanner class 
public class Q3 {
	public static void main(String[] args) {
		// Create an instance of the scanner class
		Scanner input = new Scanner(System.in);

		// Ask the user to enter his name
		System.out.print("Enter your name: ");
		// Store the value the user entered in a variable
		String name = input.nextLine();

		// Ask the user to enter a number
		System.out.print("Enter a number from 1 to 10: ");
		// Store the value the user entered in a variable
		int num = input.nextInt();
		// this is to consume the rest of the line 
		input.nextLine();

		// Ask the user to enter favorite sport
		System.out.print("Enter your favorite sport: ");
		// Store the value the user entered in a variable
		String sport = input.nextLine();

		// Ask the user to enter his hometown
		System.out.print("Enter your hometown: ");
		// Store the value the user entered in a variable
		String hometown = input.nextLine();

		// Ask the user to enter his favorite movie
		System.out.print("Enter your favorite movie: ");
		// Store the value the user entered in a variable 
		String movie = input.nextLine();

		// Ask the user to enter favorite animak
		System.out.print("Enter your favorite animal: ");
		// Store the value the user entered in a variable
		String animal = input.nextLine();

		if (num < 5) {
			// if the number is less than 5 then print this story
			System.out.println("THIS IS THE BEST STORY EVER");
			System.out.print("My name is "+name+" and I'm from "+hometown+".");
			System.out.print(" my favorite sport is "+sport+". I have a pet "+animal+" who");
			System.out.println(" I take to watch my favorite movie "+movie+".");
			System.out.println("The End!");
		}else{
			// if the number is greater than 5 then print this story
			System.out.println("THIS IS THE BEST STORY EVER");
			System.out.print("My name is "+name+" and I am a "+animal+".");
			System.out.print(" I live in "+hometown+" and love to watch "+movie+" while");
			System.out.println(" trying to play "+sport+". it does not work out so well though");
			System.out.println(" The End!");
		}
	}
}