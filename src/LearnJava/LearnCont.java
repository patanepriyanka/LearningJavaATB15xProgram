package LearnJava;

public class LearnCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1 = new Cat();
		Cat c2 = new Cat("Whiskers", 3);
		System.out.println("Cat 2 Name: " + c2.name + ", Age: " + c2.age);
		c1 = c2;
		System.out.println("Cat 1 Name: " + c1.name + ", Age: " + c1.age);
		
		
	}

}
class Cat{
	String	name;
	int age;
	
	void meow() {
        System.out.println("Meowww");
    }

	Cat() {
		System.out.println("Cat Constructor called");
	}

	Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
