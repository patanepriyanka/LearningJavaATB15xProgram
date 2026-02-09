package LearnJava;

public class starPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j, k;
		for (i=0; i<=5; i++) {
			for(k=5; k>=i; k--){
				System.out.print(" ");}
			for(j=0; j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
