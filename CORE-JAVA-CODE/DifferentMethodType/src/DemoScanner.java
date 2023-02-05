import java.util.Scanner;
public class DemoScanner {

	public static void main(String[] args) {
      
		Scanner res=new Scanner(System.in);
      
       System.out.print("Enter your Name :");
       String name = res.nextLine();
       
       System.out.print("Enter your MobileNo :");
       long mobileno = res.nextLong();
       
       System.out.print("Enter your Age :");
       int age = res.nextInt();
       
       System.out.print("Enter your Gender :");
       char gender = res.next().charAt(0);
       
       System.out.println("Your Name is :"+name);
       System.out.println("Your MobileNo is :"+mobileno);
       System.out.println("Your MobileNo is :"+age);
       System.out.println("Your MobileNo is :"+gender);

	}

}
