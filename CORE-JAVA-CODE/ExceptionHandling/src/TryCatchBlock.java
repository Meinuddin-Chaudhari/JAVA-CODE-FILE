import java.util.Scanner;

public class TryCatchBlock { 
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		try
		{
		System.out.println("Enter The Numerator:");
		int a=sc.nextInt();
		System.out.println("Enter The Denominator:");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Enter valid denominator please");
		}
		
		try {
		   System.out.println("Enter ArraySize");
		   int a=sc.nextInt();
		   int [] ar=new int[a];
		
			System.out.println("Enter element to be inserted in that array");
			int ele=sc.nextInt();
			 
			System.out.println("Enter the Position to be inserted");
			int po=sc.nextInt();
			
			ar[po]=ele;
			System.out.println("Element"+ele+"inserted positioin"+po);
	    }
		
		catch(NegativeArraySizeException ane)
		{
			System.out.println("Be positive");
		}
		catch(ArrayIndexOutOfBoundsException aioue)
		{
			System.out.println("Be in your Limit,Dont cross ");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
	}

}
