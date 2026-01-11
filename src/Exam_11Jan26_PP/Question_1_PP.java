package Exam_11Jan26_PP;
import java.util.Scanner;

public class Question_1_PP {

	public static void main(String[] args) {
		//Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
		int i, j;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter first integer number:");
		i = scan1.nextInt();
		System.out.println("Enter second integer number:");
		j = scan1.nextInt();
		System.out.println("Sum of numbers: " + (i + j));
		System.out.println("Difference between Number1 and Number 2: " + (i - j));
		System.out.println("Multiplication of Numbers: " + (i * j));
		System.out.println("Division of Number1/Number2: " + (i / j));
		System.out.println("Remainder of Number1%Number2: " + (i % j));
		scan1.close();
		
	}

}
