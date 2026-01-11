package Exam_11Jan26_PP;
import java.util.Scanner;

public class Question_2_PP {

	public static void main(String[] args) {
		//Write a Java program to check whether a given number is even or odd using arithmetic operators.
		long num1;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a Whole number:");
		num1 = scan1.nextInt();
		if (num1%2==0) {
			System.out.println(num1 + " is an Even number.");
		} else if (num1%2!= 0){
			System.out.println(num1 + " is an Odd number.");
		}
		scan1.close();
	}

}
