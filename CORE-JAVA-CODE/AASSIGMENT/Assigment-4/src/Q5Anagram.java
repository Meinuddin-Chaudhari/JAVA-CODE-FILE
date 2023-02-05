public class Q5Anagram {

	public static void main(String[] args) {
		boolean flag=false;
		String s1="RACE";
		String a="";
		String s2="CAREHGY";
		String b="";

		//lower case
		for(int i=0;i<s1.length();i++)
		{
			a=a+(char)(s1.charAt(i)+32);
		}
		
		for(int i=0;i<s2.length();i++)
		{
			b=b+(char)(s2.charAt(i)+32);
		}
		
		//convert to array
		char[] ch1=a.toCharArray();
		char[] ch2=b.toCharArray();

		//sorting
			for(int i=0;i<ch1.length-1;i++)
			{
				for(int j=0;j<ch1.length-1;j++)
				{
					 char temp;
					if(ch1[j]>ch1[j+1])
					{
					temp =ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
					}
				}
			}	
			for(int i=0;i<ch2.length-1;i++)
			{
				for(int j=0;j<ch2.length-1;j++)
				{
					 char temp;
					if(ch2[j]>ch2[j+1])
					{
					temp =ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp;
					}
				}
			}
			//compare
			for(int i=0;i<ch1.length;i++)
			{	
				  if(ch1[i]!=ch2[i])
				  {
				  System.out.println(" not anagram");	
				  flag=true;
				  break;
				  }			
			}
			if(flag==false)
			{
				System.out.println(" anagram");
			}
	}
}
