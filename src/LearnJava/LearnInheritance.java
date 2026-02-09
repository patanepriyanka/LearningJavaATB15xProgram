package LearnJava;

public class LearnInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
	
		Wolf wolf = new Wolf();
		wolf.howl();
		wolf.eat();
	}
}

class Animal {
	int age = 10;
	void eat(String string) {
		System.out.println("This animal eats food.");
	}

	void eat() {
		System.out.println("This animal eats food.");
	}
}	
class Dog extends Animal{
	void bark() {
		System.out.println("The dog barks." + age);
	}
	@Override
	void eat() { // Dynamic polymorphism: overriding the eat method of the Animal class 
		System.out.println("The dog eats dog food.");
	}
}

class Wolf extends Dog {
	void howl() {
		System.out.println("The wolf howls.");
	
	}

	void sit() {
		System.out.println("The wolf sits.");
	}
	void eat(String a) { // Dynamic polymorphism: overriding the eat method of the Dog class
		System.out.println("The wolf eats raw meat.");
	}
	@Override
	void eat() { // Dynamic polymorphism: overriding the eat method of the Dog class
		System.out.println("The wolf eats meat.");
	}
}