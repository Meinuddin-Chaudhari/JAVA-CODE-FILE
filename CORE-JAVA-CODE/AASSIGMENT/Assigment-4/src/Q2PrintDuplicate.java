public class Q2PrintDuplicate
{
   public static void main(String argu[]) {
      
	   String s1 = "meinuddin";
      
      char[] ar = s1.toCharArray();
     
    
      for (int i = 0; i < s1.length(); i++) 
      {
         for (int j = i+1; j < s1.length(); j++)
         {
            if (ar[i] == ar[j]) 
            {
               System.out.print(ar[j] + " ");
               break;
            }
         }
      }
      
      
   }
}