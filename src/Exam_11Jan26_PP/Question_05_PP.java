package Exam_11Jan26_PP;
import java.util.Scanner;
public class Question_05_PP {

	public static void main(String[] args) {
		// Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.
		int i, j;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter an integer number:");
		i=scan1.nextInt();
		j=(i>0)?1:(i<0)?-1:0;
		
		if (i == 0) {System.out.println(i + " is Zero.");}
			else if (j == 1) {System.out.println(i + " is a Positive number.");} 
			else if (j == -1) {System.out.println(i + " is a Negative number.");}
		
		scan1.close();
	}

}
