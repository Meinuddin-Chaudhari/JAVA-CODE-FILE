
public class Q8MaximumCharacterOccur {
	
	   static char max(String s1) 
	   {
		  char ans = 'a';
	      int maxfreq = 0;
	      
	      int count[] = new int[256];
	     
	      for (int i = 0; i < s1.length(); i++) 
	      {
	         count[s1.charAt(i)]++;
	         if (count[s1.charAt(i)] > maxfreq) 
	         {
	            maxfreq = count[s1.charAt(i)];
	            ans = s1.charAt(i);
	         }
	      }
	      return ans;
	   }
	   public static void main(String[] args) 
	   {
	      String s = "meinuddini";
	      System.out.println("Maximum occurring character is " + max(s));
	   }
	} 