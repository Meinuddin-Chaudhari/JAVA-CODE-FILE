//1-D Array
import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[2];
	
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter number"+i);
			ar[i]=sc.nextInt();
		}
		
		System.out.println("After Entering the Number is :");

		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
			
		}
	}
}
