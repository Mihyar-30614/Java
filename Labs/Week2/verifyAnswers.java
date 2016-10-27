/* CSCI 1100-Lab1-Exercise 2
 This program is to verify results of the first question of Lab2
 <Mihyar Al-Masalma> <B00759975> <9/27/2016>*/
public class verifyAnswers {
	public static void main(String[] args) {
		System.out.println("4 * 2 / 9 + 4 * 2"+" -> "+ (4*2/9+4*2));
		System.out.println("5 / 3 + 5 / 4"+" -> "+ (5/3+5/4));
		System.out.println("5 / 3.0 + 5 / 4"+" -> "+ (5/3.0+5/4));
		System.out.println("15 / ( 2 + 3 ) / 2"+" -> "+ (15/(2+3)/2));
		System.out.println("6 / 4.0 * 3 + 2"+" -> "+ (6/4.0*3+2));
		System.out.println("3 * 3 / 4.0 * 2 / 2.0 + 3.5"+" -> "+ (3*3/4.0*2/2.0+3.5));
		System.out.println("4.0 / 2 + 5 / 6 + 0.5 - 5"+" -> "+ (4.0/2+5/6+0.5-5));
	}
}