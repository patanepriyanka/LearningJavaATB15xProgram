package Exam_11Jan26_PP;
import java.util.Scanner;
public class Question_3_PP {

	public static void main(String[] args) {
		// Write a Java program to convert a double value into an int using explicit type casting and print both values.
		double d1;
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter a Decimal number:");
		d1=scan1.nextDouble();
		int i1=(int)d1;
		System.out.println("Decimal number: "+d1);
		System.out.println("Converted Integer number: "+i1);
		scan1.close();
	}

}
