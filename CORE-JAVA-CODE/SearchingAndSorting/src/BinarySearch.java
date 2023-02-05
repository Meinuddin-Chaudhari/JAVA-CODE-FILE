import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		  
		int []ar= {10,20,30,40,50,60};
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int key=sc.nextInt();
		
		int low=0;
		int high=ar.length-1;
		int mid;
		
		while(low<=high) 
		{
			mid=(low+high)/2;
			if(key==ar[mid])
			  {
				System.out.println("key found "+key+" at index "+mid);
				break;
			}
			else if(key<mid)
			{
				high=mid-1;
			}
			else if(key>mid)
			{
				low=mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("key not found");
		}
	}
}
