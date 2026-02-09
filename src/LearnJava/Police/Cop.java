package LearnJava.Police;

public class Cop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextCase t1 = new TextCase(5, 10);
	}
}

class BaseClass{
	private int a;
	BaseClass(){
        System.out.println("Base Class Constructor");}
        
	BaseClass(int x){
		this.a = x;
		System.out.println("Base Class Constructor with parameter: " + x);
}
}
	
class TextCase extends BaseClass {
	private int b;
	TextCase(int a, int b) {
		super(a);
		this.b= b;
		// Calling the parameterized constructor of the base class
		System.out.println("TextCase Constructor" + " with parameters: " + a + ", " + b);
		
		
	}
}
//Super is used when we want to call the parent constructor and set the private field value
// Class extends father
// Child extends father Abstract class
// Child implements fatther Interface