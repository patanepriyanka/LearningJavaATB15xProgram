package Exam_11Jan26_PP;

public class Question_13_PP {

	public static void main(String[] args) {
		// Write a Java program to print numbers from 1 to 10, but skip printing the number 5 using the continue statement.
		int i=1;
		for (i = 1; i <= 10; i++) {
			if (i == 5) {continue;}
			System.out.println(" " + i);
		}

	}

}
