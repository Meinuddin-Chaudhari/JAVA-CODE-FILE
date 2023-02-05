import java.util.Scanner;

public class ForeachLoop3DarrayWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [][][] ar =new int[2][2][2];
		for(int i=0;i<ar.length;i++) 
		{
		    for(int j=0;j<ar[i].length;j++)
		   {
	           for(int k=0;k<ar[i][j].length;k++) 
		       {
		        System.out.println("enter college"+i+"class"+j+"student"+k);
		       ar[i][j][k]=sc.nextInt();
		       }
		    }
		}
		
		for(int el[][]:ar)
		{
		     for(int ele[]:el)
		      {
		          for(int elem:ele)
		           {
		          System.out.println(elem);	
		           }
	 
		      }
		}
	}

}
