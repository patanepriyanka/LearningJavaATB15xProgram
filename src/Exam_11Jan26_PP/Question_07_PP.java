package Exam_11Jan26_PP;
import	java.util.Scanner;
public class Question_07_PP {

	public static void main(String[] args) {
		// Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
		int i, j, operation;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter first integer number:");
		i=scan1.nextInt();
		System.out.println("Enter second integer number:");
		j=scan1.nextInt();
		System.out.println("Choose an operation to perform:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
	    System.out.println("3. Multiplication");
	    System.out.println("4. Division");
	    operation=scan1.nextInt();
	    switch(operation) {
	    case 1: System.out.println("Addition of Numbers: " + (i + j));
	    break;
	    case 2: System.out.println("Subtraction between Number1 and Number 2: " + (i - j));
	    break;
	    case 3: System.out.println("Multiplication of Numbers: " + (i * j));
	    break;
	    case 4: System.out.println("Division of Number1/Number2: " + (i / j));
	    break;
	    default: System.out.println("Please choose a valid operation (1-4).");
	    
	    }
	    scan1.close();        
	}

}
