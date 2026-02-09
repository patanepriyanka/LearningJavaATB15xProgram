package LearnJava;

public class Encaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bundling the data and the methods that operate on that data into a single unit (class) and restricting access to some of the object's components
		// Data Hiding
		// use getter and setters
		//use access modifiers like private, public, protected
		VoLOgin login = new VoLOgin("admin","12345");
		GoodVoLogin goodLogin = new GoodVoLogin("admin","12345");
		System.out.println("VoLogin Username: " + login.username + ", Password: " + login.password);
		goodLogin.setUsername("newAdmin");
		goodLogin.setPassword("hello123))", true);
		System.out.println("GoodVoLogin Username: " + goodLogin.getUsername() + ", Password: " + goodLogin.getPassword());
		
		
	
		
	}

}
class VoLOgin{
	public String username;
	public String password;
	public VoLOgin(String username, String password) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
	}
	
	
}

class GoodVoLogin{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password, boolean validate ) {
		
		if(validate) {this.password = password;}
		
	}

	public GoodVoLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
}
