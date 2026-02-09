package LearnJava;
public class Students{
	Students(int roll, String name){ // Parameterized constructor
		System.out.println("Student details " + "Roll No:" + roll + " Name: " + name);
	}
	Students(){ System.out.println("Hello constructor");} // Non parameterized constructor
	
	Students(int roll){
		String name = "Default";
		System.out.println("Student details " + "Roll No:" + roll + " Name: " + name);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		Students S2 = new Students(10);
		Students s3 = new Students(11, "Neha");
		School sc1 = new School(1990, "SVM");
		A a1= new A(1, 2);
	}

}

class A{
	int a,b;
	
	A(){}
	A(int a, int b){
	System.out.println("Sum" + (this.a+this.b));}
}
class B{}