
//2D Regular Array
import java.util.Scanner;

public class Array2DRegular {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][]ar = new int [2][2];
		
		for (int i=0;i<ar.length;i++)
		{
			for (int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter Class"+i+"And Student"+j);
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The entered number is:");
		
		
		for (int i=0;i<ar.length;i++)
		{
			for (int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
		}
		
		
		
	}

}
