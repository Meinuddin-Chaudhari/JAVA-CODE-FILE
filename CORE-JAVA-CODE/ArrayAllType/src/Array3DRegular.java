//3D Regular Array
import java.util.Scanner;

public class Array3DRegular {

	public static void main(String[] args) {
		
		
		
		Scanner sc  =new Scanner(System.in);
		int [][][]ar =new int[2][2][2];
		for(int i=0;i<ar.length;i++)
		{
		   for(int j=0;j<ar[i].length;j++)
		   {
			   for(int k=0;k<ar[i][j].length;k++)
			    {
				  System.out.println("Enter college"+i+"class"+j+"student"+k);
				  ar[i][j][k]=sc.nextInt();
			    }
			    
		   }
		}

		System.out.println("After Entering the number:");
		
		
		for(int i=0;i<ar.length;i++)
		{
		   for(int j=0;j<ar[i].length;j++)
		   {
			   for(int k=0;k<ar[i][j].length;k++)
			    {
				  System.out.print(ar[i][j][k]+" ");
				  
			    }
			    
		   }
		}
		

	}

}
