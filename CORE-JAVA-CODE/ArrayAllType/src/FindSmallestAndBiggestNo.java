
public class FindSmallestAndBiggestNo {

	public static void main(String[] args) {
	/*	// max
       int [] ar = {10,40,90,30,60,9,65};
       int max=ar[0];
       for(int i=0;i<ar.length;i++)
       {
    	   if(ar[i]>max)
    		   max=ar[i];
       }
       System.out.println(max);*/
       
       
       //min
       int [] ar = {10,40,90,30,60,9,65};
       int min=ar[0];
       for(int i=0;i<ar.length;i++)
       {
    	   if(ar[i]<min)
    		   min=ar[i];
       }
       System.out.println(min);
	}

}
