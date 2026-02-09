package LearnJava;

public class poly_learn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Polymorphism allows us to treat objects of different classes through a common interface.
		//Check dynamic polymorphism where methods override in the child class
		Animal a1 = new Dog();
		a1.eat(); // This will call the eat method of the Dog class, not the Animal class, due to dynamic polymorphism.
		Animal a2 = new Wolf();
		a2.eat(); // This will call the eat method of the Wolf class, not the Animal class, due to dynamic polymorphism.
		a2.eat("meat"); // This will call the eat method of the Wolf class that takes a String argument, demonstrating method overloading in addition to overriding.
		Wolf w1 = new Wolf();
		w1.sit();
		MethodOverloading mo = new MethodOverloading();
		mo.display();
		mo.display("Hello, World!");
		int result = mo.display(5);
		
		
	}

}

class MethodOverloading {
	void display() {
		System.out.println("Display method with no parameters");
	}

	void display(String message) {
		System.out.println("Display method with a String parameter: " + message);
	}

	int display(int number) {
		System.out.println("Display method with an int parameter: " + number);
		return number * 2;
	}
}



