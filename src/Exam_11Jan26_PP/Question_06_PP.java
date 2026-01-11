package Exam_11Jan26_PP;
import java.util.Scanner;
public class Question_06_PP {

	public static void main(String[] args) {
		// Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
		int day;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7:");
		day=scan1.nextInt();
		switch(day) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.println("Please enter value between 1 to 7 only");
		
		scan1.close();
		
				
		}

	}

}
