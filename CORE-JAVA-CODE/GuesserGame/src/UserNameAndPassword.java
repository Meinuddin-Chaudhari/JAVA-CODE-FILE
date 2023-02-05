import java.util.Scanner;

public class UserNameAndPassword {

	public static void main(String[] args) {
			
		Scanner sc =new Scanner(System.in);
		System.out.println("Choose Username :");
		String usernameChoosen =sc.nextLine();
		
		System.out.println("Choose Password :");
		String passwordChoosen =sc.nextLine();
		
		System.out.println("---Enter you Detail---");
		
		System.out.println("Enter Username:");
		String username =sc.nextLine();
		
		
		if(usernameChoosen.equalsIgnoreCase(username))
		{
			System.out.println("Enter Password:");
			String password =sc.nextLine();
			if(passwordChoosen.equals(password))
			{
				System.out.println("Your Information are right");
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
