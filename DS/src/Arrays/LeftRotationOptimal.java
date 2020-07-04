package Arrays;

import java.util.Scanner;

public class LeftRotationOptimal {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,d;
		
		System.out.println("enter input for n and d");
		
	Scanner sc=new Scanner(System.in);
	
	String[] nd=sc.nextLine().split(" ");
	
	n=Integer.parseInt(nd[0]);
	d=Integer.parseInt(nd[1]);
	
	int a[]=new int[n];
	String[] allitems= sc.nextLine().split(" ");
	sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	
	for(int i=0;i<n;i++) {
		a[i]=Integer.parseInt(allitems[i]);
	}
	
	leftRotate(a,d);

	

	}
	
	public static void leftRotate(int arr[], int d) 
    { 
		
		 int mod =d % arr.length; 
		 
        for (int i = 0; i < arr.length; i++) {
        	  System.out.print(arr[(i + mod) %  arr.length] 
                      + " ");  
        }
            
    } 
	
	

}

/*
 * 
o(n] time complexity
o(1) space complexisty


*/
