
import java.util.*;
class StringTokenizer1  
{
public static void main(String[] args) 
 {
     StringTokenizer stk = new
     StringTokenizer("sachin$ramesh$tendulkar","$");
     
     int tokenCount = stk.countTokens();
     System.out.println(tokenCount);
     
     while (stk.hasMoreTokens())
    {
      String data = stk.nextToken();
       System.out.println(data);
    }
 }
}