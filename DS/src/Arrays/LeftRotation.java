package Arrays;

import java.util.Scanner;

public class LeftRotation {
	


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
	for(int i=0;i<n;i++) {
		System.out.println(a[i]+" ");
	}
	

	}
	
	public static void leftRotate(int arr[], int d) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr); 
    } 
	
	public static int[] leftRotatebyOne(int a[]) {
		
		int temp=a[0];
		int i;
		for(i=0;i<a.length-1;i++)
			a[i]=a[i+1];	
				
				
		a[i-1]=temp;
		
		return a;
		
		
		
	}

}

/*
 * 


*/
