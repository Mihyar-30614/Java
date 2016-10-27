import java.util.Scanner;
public class Q1{
public static void main(String[] args) {
    int lightRed, lightGreen;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Input value for lightRed: ");
    lightRed = keyboard.nextInt();  	// input
    System.out.print("Input value for lightGreen: ");
    lightGreen = keyboard.nextInt();	// input
    String action = "nothing";
    if (lightRed == 0){ 
      action = "Jump"; 
    }
    else {
      action = "Shout";  
    } 
    System.out.println("Action 1: " + action);
    if (lightGreen != 0){
      action = "Kick";
    } 
    else { 
      action = "Bend"; 
    }  
    System.out.println("Action 2: " + action);
	if (lightRed != lightGreen) 
	   action = "Shriek";
    System.out.println("Action 3: " + action);
  }
}							