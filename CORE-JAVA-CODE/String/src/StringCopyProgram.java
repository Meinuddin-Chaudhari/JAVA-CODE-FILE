
public class StringCopyProgram {

	public static void main(String[] args) {
		String a="meinuddin";
		String b="";
		
		for(int i=0;i<a.length();i++)
		{
			b=b+a.charAt(i);
		}
		System.out.println(a);
		System.out.println("After copying: ");
		System.out.println(b);
	}
}
