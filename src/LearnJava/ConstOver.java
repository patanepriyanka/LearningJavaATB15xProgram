package LearnJava;

public class ConstOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "Camry");
		Car car2 = new Car("Honda");
		Car car3 = new Car();
		
		System.out.println("Car 1: " + car1.name + " " + car1.model);
		car2.model = "Civic";
		System.out.println("Car 2: " + car2.name + " " + (car2.model != null ? car2.model : "Model not specified"));
	}

}

class Car{
	String name;
    String model;
    
	Car(String name, String model) {
		this.name = name;
		this.model = model;
	}

	Car(String name) {
		this.name = name;
	}	
	Car(){
		System.out.println("This is default constructor");
	}
}