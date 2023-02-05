import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	   int [] ar= {10,20,30,40,50,60};
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter number");
	   int key =sc.nextInt();
	   boolean flag=false;
	    for(int i=0;i<ar.length;i++)
	    {
	    	if(key==ar[i])
	    	{
	    		System.out.println("key found "+key+" at index "+i);
	    		flag=true;
	    		break;
	    	}
	    }
		if(flag==false)	
		{
			System.out.println("key not found");
		}
	}

}
