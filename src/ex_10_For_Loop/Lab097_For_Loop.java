package ex_10_For_Loop;

public class Lab097_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop
		//Initialization -> Condition -> Increment/Decrement
		for (int i = 1; i <= 10;) {
			i++;
			
			if (i == 5) {
				System.out.println("Breaking the loop at i = " + i);
				break; // Exit the loop when i is 5
			}
			System.out.println("Number: " + i);
		}

	}

}
