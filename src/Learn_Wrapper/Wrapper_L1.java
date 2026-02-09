package Learn_Wrapper;

public class Wrapper_L1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper class are used to convert primitive data types into objects and vice versa
		// use utility methods with data type objects
		// can be null values 
		int a = 10; // primitive data type
		System.out.println("Primitive int: " + a); // getClass() is not available for primitive data types);
		Integer a1 = 20;
		System.out.println("Wrapper Integer: " + a1); // getClass() is available for wrapper classes
		System.out.println("Integer Class: " + a1.min(a, a1)); // utility method to get minimum value); 
		System.out.println("Integer Class: " + a1.MIN_VALUE);
	}

}
