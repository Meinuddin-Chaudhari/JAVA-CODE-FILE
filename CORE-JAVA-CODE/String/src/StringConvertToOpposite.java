
public class StringConvertToOpposite {

	public static void main(String[] args) {
		String a="MeiNuddIn";
		String b="";
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)>='a' && (a.charAt(i)<='z'))
			{
				b=b+(char)(a.charAt(i)-32);
			}
			else {
				b=b+(char)(a.charAt(i)+32);
			}
		}
		
		System.out.println(b);


	}

}
