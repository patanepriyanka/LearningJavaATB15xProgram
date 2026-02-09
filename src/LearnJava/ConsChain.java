package LearnJava;

public class ConsChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage login1 = new LoginPage("Browse", "U1", "P1");
		System.out.println("Name: " + login1.name + ", User: " + login1.user + ", Password: " + login1.password);
	}

}
class LoginPage{
	String name, user, password;
	LoginPage() {
		this("Selenium");
		System.out.println("Default Constructor");
	}	
	LoginPage(String name){
		this.name = name;
	}
	LoginPage(String name, String user, String pass){
		this(name); // Constructor Chaining
		this.user = user;
		this.password = pass;
	}
	
	
}
