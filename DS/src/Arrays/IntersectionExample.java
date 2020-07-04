package Arrays;

import java.util.HashSet;

public class IntersectionExample {

	  public static HashSet<Integer> arrayIntersection(int[] arr1, int[] arr2) {
	      // fill in
	      // with solution
		  
		
			HashSet<Integer> hs = new HashSet<>(); 
	        HashSet<Integer> result = new HashSet<>(); 
	        
	        for(int x:arr1) {
	        	hs.add(x);
	        	
	        }
	        
	        for(int x:arr2) {
	        	
	        	if(hs.contains(x)) {
	        		result.add(x);
	        	}
	        }
		  

		  
		  
	      return result;
	  }

	    // remove or comment if running tests (we run our own main)
	    public static void main(String[] args) {
	    	
	    	int arr1[]= {1,2,2,4};
	    	int arr2[]= {3,2,4};
	   
	    	HashSet<Integer> result=  arrayIntersection(arr1,arr2);
	    	
	    	Integer[] finalResult = result.toArray(new Integer[result.size()]);
	    	for (Integer integer : finalResult) {
				System.out.println("hello"+integer.intValue());
			}
	    }
}
