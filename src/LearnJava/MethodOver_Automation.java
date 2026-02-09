package LearnJava;

public class MethodOver_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class CommonAll{
	void openBrowse() {
		System.out.println("Opening the browser");
	}
}

class Chrome extends CommonAll {
	@Override
	void openBrowse() {
		System.out.println("Opening the Chrome browser");
	}
}

class Firefox extends CommonAll {
	@Override
	void openBrowse() {
		System.out.println("Opening the Firefox browser");
	}
}