 import java.util.*;
public class Q1RemoveDuplicate
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("Please enter a String");
        String s1 = sc.nextLine(); 
        
        char[] ar = s1.toCharArray(); 
        int len = s1.length();
        
        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<len;j++)
            {
                if(ar[i] == ar[j]){
                	
                for(int k=i+1; k<len-1; k++)
                {
                    ar[k] = ar[k+1];
                }
                len--;
                j--;
            }
        }
    }
    System.out.println("After removing duplicate character");
    for(int i=0;i<len;i++)
    {  
        System.out.print(ar[i]);  
    } 
    
   }
}
