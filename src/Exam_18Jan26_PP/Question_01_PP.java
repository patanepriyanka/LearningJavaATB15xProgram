package Exam_18Jan26_PP;
import java.util.Scanner;
public class Question_01_PP {

	public static void main(String[] args) {
		// Write a Java program to count the total number of characters in a given string (excluding spaces).
		String str1;
		int i;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a String:");	
		str1 = scan1.nextLine();
		int count = 0; 
		for (i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total number of characters in String: " + count);

	}

}
