package Learn_Wrapper;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		Integer num1 = num; // Autoboxing
		System.out.println("Autoboxing: " + num1); // Primitive data type convert to Wrapper object
		
		Integer num2 = 20;
		int b = num2; // Unboxing
		System.out.println("Unboxing: " + b); // Wrapper object convert to primitive data type
	}

}
