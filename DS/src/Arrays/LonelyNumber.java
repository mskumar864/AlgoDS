package Arrays;

import java.util.HashSet;

public class LonelyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LonelyNumber.lonelyNumber(new int[] {1, 2, 3});
	}

	
	   public static int lonelyNumber(int[] numbers) {
	        // fill in
	        // with solution
		   
		  HashSet apperances=new HashSet<>();
		  
		  for (int number :numbers) {
			  
			  if(apperances.contains(number)) {
				  apperances.remove(number);
			  }
			  else {
				  apperances.add(number);
			  }
			  
		  }
	        return 0;
	    }
}
