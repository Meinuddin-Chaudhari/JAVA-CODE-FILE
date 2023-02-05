import java.util.Scanner;
class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msgg)
	{
		super(msgg);
	}
}
class ATM
{
	int userid=1111;
	int password=2222;
	int pw;
	int uid;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Kindly enter the user id");
		uid=sc.nextInt();
		
		System.out.println("Kindly enter the pasword");
		pw=sc.nextInt();	
	}
	public void verify() throws InvalidCustomerException
	{
		if((userid== uid) && (password == pw))
		{
			System.out.println("Take your cash");
		}
		else
		{
			InvalidCustomerException ice=new InvalidCustomerException("Are you sure? try again bcz wrong input");
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM a=new ATM();
		try 
		{
			a.input();
			a.verify();
		} 
		catch (InvalidCustomerException e1)
		{
			try 
			{
				a.input();
				a.verify();
			
			} 
			catch (InvalidCustomerException e2)
			{
				try 
				{
					a.input();
					a.verify();
				} 
				catch (InvalidCustomerException e3)
				{
					System.out.println("Oh Choor dude we caught you card is blocked!!");
					System.exit(0);
				}
				
			}
			
		}
	}
}
public class ATMExceptionHandling {
	public static void main(String[] args) {	 
		Bank b=new Bank();
		b.initiate();
	}
}