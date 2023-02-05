public class Palindrome {

	public static void main(String[] args) {
		String s1="nitinerger";                                 
		boolean flag=false;
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		char []ar1 =s1.toCharArray();
		char []ar2 = s2.toCharArray();
		
		for(int i=0;i<ar1.length;i++)
		{
		  	if(ar1[i]!=ar2[i])
		     {
			   System.out.println(" not palindrome");
			   flag=true;
			   break;	 
		     }
		}
		if(flag==false)
		System.out.println(" palindrome");					
    }  
}