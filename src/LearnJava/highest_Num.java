package LearnJava;

public class highest_Num {

	public static void main(String[] args) {
		// find 2nd highest number in an 
		int[] num = {12, 32, 10, 1, 100, 33, 4, 34};
		
	    int i, max=0, sMax=0;
	    
	    for(i = 0; i < num.length; i++) {
				if (num[i] > max) {
					sMax = max; System.out.println("sMax: " + sMax);
					max = num[i]; System.out.println("max: " + max);
					System.out.println("------");
				} 
				else if (num[i] > sMax && num[i] != max) {
					sMax = num[i]; System.out.println("sMax in else if: " + sMax);
				}
	    		  
	    	  }
	    
		
	    System.out.println("Second highest number is: " + sMax);
	}

}
