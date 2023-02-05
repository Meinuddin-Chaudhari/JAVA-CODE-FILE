

import java.util.Scanner;
class InvalidCustomerException  extends Exception
{
	InvalidCustomerException(String msg)
	{
	   super(msg);
	}
}
class ATM
{
	int userid=1234;
	int password=1111;
	int pw;
	int uid;
   public void input()
   {
	   Scanner scan=new Scanner(System.in);
		System.out.println("Enter Userid:");
		int uid=scan.nextInt();
		
		System.out.println("Enter Password:");
		int pw=scan.nextInt();
   }
   public void verify() throws InvalidCustomerException 
   {
	   if((userid== uid) && (password == pw))
		{
			System.out.println("Take your cash");
		}
	   else
	   {
		   InvalidCustomerException  ice =new InvalidCustomerException("Try again You have entered wrong password");
		  System.out.println(ice.getMessage()); 
		   throw ice;
	   }
   }  
}

class Bank 
{
     public void Initiate()
     {
    	 ATM a=new ATM();
    	  try
    	  {  
          a.input();
          a.verify();
          }
          catch(InvalidCustomerException  ie1)
    	  {
        	          try
          	          {  
                        a.input();
                        a.verify();
                      }
                      catch(InvalidCustomerException  ie2)
                      {
            	               try
                	           {  
                               a.input();
                               a.verify();
                               }
                               catch(InvalidCustomerException  ie3)
                               {
            	                  System.out.println("Chor");
            	                  System.exit(0);
                               }
                     }
          }
    }
}
public class gg{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.Initiate();
	}
}


