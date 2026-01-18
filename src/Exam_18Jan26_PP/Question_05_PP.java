package Exam_18Jan26_PP;
import java.util.Scanner;
public class Question_05_PP {

	public static void main(String[] args) {
		// Write a Java program to reverse a given string using a loop.
		String str1, str2 ="";
		int i;
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("SEnter a string");
	
		str1 = scan1.nextLine();
		
		for (i = str1.length()-1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println("Reversed String is: " + str2);
		
		

	}

}
