import java.util.Scanner;
class Alpha
{
	public void disp() throws ArithmeticException
	{
	try
	{
		Scanner sc =new Scanner(System.in);
		
	System.out.println("Enter The Numerator:");
	int aa=sc.nextInt();
	System.out.println("Enter The Denominator:");
	int b=sc.nextInt();
	int c=aa/b;
	System.out.println(c);
     }
	
	catch(ArithmeticException e)
	{
		System.out.println("Enter valid denominator please");
		throw e;
	}
	finally
	{
		System.out.println("finally block");
	}
  }
}
class Beta
{
	public void disp1() throws ArithmeticException
	{
	Alpha a=new Alpha();
	a.disp();
	}
}
public class TryCatchThrowFinallyThrowsUses { 
	public static void main(String[] args) {

		try
		{
		Beta b=new Beta();  
		b.disp1();
		}
		catch(ArithmeticException ee)
		{
			System.out.println("main handled");
		}			
	}
}