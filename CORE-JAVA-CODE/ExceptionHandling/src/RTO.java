import java.util.Scanner;
class UnderAgeException extends Exception
{
	UnderAgeException(String uae)
	{
		super(uae);
	}
}
class OverAgeException extends Exception
{
	OverAgeException(String oae)
	{
		super(oae);
	}
}
class applicant
{
	Scanner sc=new Scanner(System.in);
	int age;
	
	public void input()
	{
	System.out.println("Enter Age");
	age=sc.nextInt();
	}
	
	public void verify() throws UnderAgeException,OverAgeException
	{

		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException("you are under age ");
			System.out.println(uae.getMessage());
			throw uae;
		}
		if(age>60)
		{
			OverAgeException oae=new OverAgeException("you are over age");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Your are eligble");
		}
		
	}
}
class rto2
{
	public void Initiate()
	{
	  applicant a=new applicant();
	  try
	  {
		a.input();	
		a.verify();
	  }
	  catch(UnderAgeException | OverAgeException e1)
	  {
		  try
		  {
			a.input();	
			a.verify();
		  }
		  catch(UnderAgeException | OverAgeException e2)
		  {
		    System.out.println("Read Rules");
		  }
	  }
   }
}
public class RTO {
	public static void main(String[] args) {
		
          rto2 r= new rto2();
          r.Initiate();
	}
}
