package Exam_18Jan26_PP;
import java.util.Scanner;
public class Question_03_PP {

	public static void main(String[] args) {
		// Write a Java program to convert a given string into uppercase and print the result.
		String str1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a string");
		String str2;
		str1 = scan1.nextLine();
		str2 = str1.toUpperCase();
		System.out.println("String in Uppercase: " + str2);

	}

}
