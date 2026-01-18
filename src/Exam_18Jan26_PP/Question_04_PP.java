package Exam_18Jan26_PP;
import java.util.Scanner;
public class Question_04_PP {

	public static void main(String[] args) {
		// Write a Java program to compare two strings and check whether they are equal or not.
		String str1, str2;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter String 1:");
		str1 = scan1.nextLine();
		System.out.println("Enter String 2");
		str2 = scan1.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}
		scan1.close();
	}
	

}
