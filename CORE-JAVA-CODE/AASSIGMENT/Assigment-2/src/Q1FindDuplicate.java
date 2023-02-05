
public class Q1FindDuplicate {

	public static void main(String[] args) {
		 int [] ar= {10,20,30,40,44,4,66,20,44};
	      boolean flag=false;
	      for(int i = 0;i<ar.length;i++)
	      {  
	          for(int j = i+1;j<ar.length;j++)
	          {
	        	if(ar[i]==ar[j])
	        	{
	        	System.out.print(ar[i]+" ");
	             flag=true;
	        	} 
	          } 
	      }
	      if(flag==false)
	      {
	    	  System.out.println("Duplicate Element Not Found ");  
	      }
	}
}
