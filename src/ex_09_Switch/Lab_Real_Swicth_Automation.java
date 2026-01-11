package ex_09_Switch;
import java.util.Scanner;

public class Lab_Real_Swicth_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the Browser ");
		String browser = scanner.nextLine();
		
		switch (browser.toLowerCase()) {
		case "chrome":
			System.out.println("Launching Chrome Browser");
			break;
		case "firefox":
			System.out.println("Launching Firefox Browser");
			break;
		case "safari":
			System.out.println("Launching Safari Browser");
			break;
		case "edge":
			System.out.println("Launching Edge Browser");
			break;
		default:
			System.out.println("Browser not supported");
			break;
		}
	}

}
