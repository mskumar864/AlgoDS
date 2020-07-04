import java.util.Scanner;

public class TwoDArray {

	
	public static void main(String args[]) {
		
		int m1[][]=new int[3][3];
		
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				 System.out.print("Enter Element");  
				m1[i][j]=sc.nextInt();
				 System.out.println();
			}
		}
		
		System.out.println("Printing matrix");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m1[i][j]+"\t");
			}
			 System.out.println();
		}
	}
}
