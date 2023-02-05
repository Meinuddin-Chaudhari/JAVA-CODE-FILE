
import java.util.*;

public class Q4CountVowels
{
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\nEnter the string : ");
    String s1= sc.nextLine();
    int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

     s1= s1.toLowerCase();
     
    for(int i = 0; i < s1.length(); ++i)
    {
     char ch = s1.charAt(i);
    
     if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') 
      {
      vowels++;
      }
      else if((ch >= 'a'&& ch <= 'z')) 
      {
         consonants++;
      }
      else if( ch >= '0' && ch <= '9')
     {
       digits++;
     }
     else if (ch ==' ')
     {
       spaces++;
     }
     else
     symbols++;
      }

        System.out.println("Vowels:"  + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits:" + digits);
        System.out.println("Spaces:" + spaces);
        System.out.println("Special Character :" + symbols);
 }
}