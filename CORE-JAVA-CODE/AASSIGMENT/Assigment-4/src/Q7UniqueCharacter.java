import java.util.Arrays;
class demo
{
	 public boolean set(String s1)	
	 {
		for(int i=0;i<s1.length();i++)
		{
		   for(int j=i+1;j<s1.length();j++)
		   {
			   if(s1.charAt(i)==s1.charAt(j))
			   {
				 return false;
			   }
		   }
		}
		return true;
	 }	
}
public class Q7UniqueCharacter {

	public static void main(String[] args) {	
       
		String s="abcdefgh";
		demo d=new demo();
	if(	d.set(s))
		{
		System.out.println("unique");
		}
	else
	{
		System.out.println("duplicate");
	}
  }
}
