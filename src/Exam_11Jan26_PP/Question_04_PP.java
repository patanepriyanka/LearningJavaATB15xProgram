package Exam_11Jan26_PP;
import java.util.Scanner;
public class Question_04_PP {

	public static void main(String[] args) {
		// Write a Java program to find the maximum of two numbers using the ternary operator.
		int i, j, max;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter first integer number:");
		i=scan1.nextInt();
		System.out.println("Enter second integer number:");
		j=scan1.nextInt();
		max=(i>j)?i:j;
		System.out.println("Maximum number between "+i+" and "+j+" is: "+max);
		scan1.close();
		
	}

}
