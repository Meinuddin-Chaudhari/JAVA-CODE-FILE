import java.util.Scanner;

 class Guesser
 {
       int guessNum;
       int guessNum()
       {   
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Guesser Guess Number:");
	  
	   guessNum=sc.nextInt();
	   System.out.println();
	  
		 return guessNum;  
	   }	     
 }

 class Player
 {
     int playerNum1;
     int playerNum2;
     int playerNum3;
     
     int playerNum1()
     {
	   Scanner sc =new Scanner(System.in);
	   
	   System.out.print("Player1 Guess The Number:");
	   playerNum1=sc.nextInt();
	   
	   return playerNum1;
      }
     
     int playerNum2()
     {
	   Scanner sc =new Scanner(System.in);
	   System.out.print("Player2 Guess The Number:");
	  
	   playerNum2=sc.nextInt();
	   return playerNum2;
      }
     
     int playerNum3()
     {
	   Scanner sc =new Scanner(System.in);
	   System.out.print("Player3 Guess The Number:");
	  
	   playerNum3=sc.nextInt();
	   return playerNum3;
      }
 }

 class Umpire extends GuesserGame
{
	
	 int  numFromGuesser;
	 int  numFromPlayer1;
	 int  numFromPlayerr1;
	 int  numFromPlayer2;
	 int  numFromPlayer3;
	 
     void numberFromGuesser()
     {
    	
    	    Scanner sc =new Scanner(System.in);
    	    System.out.println("--------------------------------------------------");
			
			System.out.print("***Enter Range To Play The Game***");
			System.out.println();
			System.out.println();
			
			System.out.print("Enter Starting Range:");
		    int startrange=sc.nextInt();
		    
		    System.out.print("Enter Ending Range:");
		    int endrange=sc.nextInt();
		    
		    System.out.println("--------------------------------------------------");
			
		    Guesser g=new Guesser();
	    	 numFromGuesser=g.guessNum();
			
	    	if(numFromGuesser>=startrange && numFromGuesser<=endrange)
				{
	    	      numberFromPlayer();
			      compare();
				}
				else
				{
					System.out.println("--> Please Try To Enter Between " +startrange+" To "+ endrange + " You Have Given This Range");
				}	 	
     }
     
     void numberFromPlayer()
     {
    	 Player p1=new Player();
    	 Player p2=new Player();
    	 Player p3=new Player();
    	 
    	 numFromPlayer1=p1.playerNum1();
    	 numFromPlayer2=p2.playerNum2();
    	 numFromPlayer3=p3.playerNum3();	
     }
     
 void compare()
{
  if(numFromGuesser==numFromPlayer1)
  {
     if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
	   {
	    System.out.println("***Game Tied Between Player1 & Player2 & Player3***");  
	   }
        else if(numFromGuesser==numFromPlayer2)
	   {
	    System.out.println("***Game Tied Between Player1 & Player2***" );  
	   }
       else if(numFromGuesser==numFromPlayer3)
	   {
	   System.out.println("***Game Tied Between Player1 & Player3***" );  
	   }
     else
     {
    	 System.out.println();
         System.out.println("----Player1 Won The Game----");  
     }
  }
  else if(numFromGuesser==numFromPlayer2)
  {
	   if(numFromGuesser==numFromPlayer3)
	   {
	   System.out.println("***Game Tied Between Player2 & Player3***" );  
	   }
	   else 
	   {
	   System.out.println();
	   System.out.println("---Player2 Won The Game---");  
	   }
  }
  else if(numFromGuesser==numFromPlayer3) 
  {
	  System.out.println();
	  
	  System.out.println("---Player3 Won The Game---");  
	  System.out.println();
  }
  else
  {
	System.out.println("'''*Please Try Again*''''");  
  }
  
 }
 
}

public class GuesserGame 
{   
	public static void main(String[] args) 
	{
		  
		System.out.println("*WELCOME TO GUESSER GAME*");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("---------------------------------------------------------");
		
		System.out.print("Choose Username To Play The Game :");
		String usernameChoosen =sc.nextLine();
		
		System.out.print("Choose Password To Play The Game :");
		String passwordChoosen =sc.nextLine();
		System.out.println();
		
		System.out.println("----Enter you Detail To Match The Credentials----");
		System.out.println();
		
		System.out.print("Enter Username:");
		String username =sc.nextLine();
		
		if(usernameChoosen.equalsIgnoreCase(username))
		{
			System.out.print("Enter Password:");
			String password =sc.nextLine();
			
			System.out.println();
			
			if(passwordChoosen.equals(password))
			{
				System.out.println("***Credential Match Successfully***");
				
				System.out.println("----Let's Play The Game----");
			
				Umpire U=new Umpire();
				U.numberFromGuesser();		
			}
			else
			{
				System.out.println("Check your Password");
			}
		}
		else
		{
			System.out.println("Check your Username");
		}				
	}
}