
/**
Bubble Sort Algorithm 
*/
package sorting;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {9,7,5,8,6,25,11,10,12,19,20,2};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for( int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			for (int num : arr) {
				System.out.print(num+ "  ");
			}
			System.out.println();
		}
		
		System.out.println("sorted array");
		
		for (int num : arr) {
			System.out.print(num+ "  ");
		}

	}

}
