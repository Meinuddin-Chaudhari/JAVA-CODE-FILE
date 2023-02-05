import java.util.Arrays;

public class FillingUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] ar= {10,20,30,40,50,60,70};
       
       for(int ele:ar)
       {
    	   System.out.print(ele+ " ");
       }
       System.out.println("");
       Arrays.fill(ar, 5);
       for(int ele:ar)
       {
    	   System.out.print(ele+ " ");
       }
       System.out.println("");
       Arrays.fill(ar, 2,5,9);
       for(int ele:ar)
       {
    	   System.out.print(ele+ " ");
       }
       System.out.println("");
	}

}
