import java.util.Arrays;

public class SortingAndBinaryUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] ar= {30,90,50,10,44,11,77,25};
      
      for(int ele:ar)
      {
    	  System.out.print(ele+" ");
      }
      System.out.println(" ");
      System.out.println("After sorting");
      Arrays.sort(ar);
      for(int ele:ar)
      {
    	  System.out.print(ele+" ");
      }
      System.out.println("");
      System.out.println("After binary search");
     int arr= Arrays.binarySearch(ar, 44);
     System.out.print(arr);
     
    
	}

}
