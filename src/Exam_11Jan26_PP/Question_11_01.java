package Exam_11Jan26_PP;
import	java.util.Scanner;
public class Question_11_01 {

	public static void main(String[] args) {
		// Write a Java program to reverse a given number using a do-while loop.
		int i;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a Whole number to reverse:");
		i = scan1.nextInt();
		int r = 0;
		do {
			int digit = i % 10;
			r = r * 10 + digit;
			i = i / 10;
		} while (i != 0);
		System.out.println("Reversed Number is: " + r);
		scan1.close();
	}
}
