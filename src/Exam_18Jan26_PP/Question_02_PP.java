package Exam_18Jan26_PP;
import java.util.Scanner;
public class Question_02_PP {

	public static void main(String[] args) {
		// Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.
		String str1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a String");
		str1 = scan1.nextLine();
		
		if (str1.length() > 10) {
			System.out.println("The length of string is greater than 10 chars");
		}
		else {
			System.out.println("The length of string is not greater than 10 chars");
		}
	}
	

}
