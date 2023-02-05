
public class StringConvertLowerToUpper {

	public static void main(String[] args) {
		//lower to upper
		String a="meinuddin";
		String b="";
		
		for(int i=0;i<a.length();i++)
		{
			b=b+(char)(a.charAt(i)-32);
		}
		
		System.out.println(b);

		
		
		//upper to lower
				String c="CHAUDHARI";
				String d="";
				
				for(int i=0;i<c.length();i++)
				{
					d=d+(char)(c.charAt(i)+32);
				}
				
				System.out.println(d);

	}

}
