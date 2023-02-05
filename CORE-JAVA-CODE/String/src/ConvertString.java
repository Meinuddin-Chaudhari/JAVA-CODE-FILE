
public class ConvertString {

	public static void main(String[] args) {
		//Convert Hello Java to Java Hello
		String a="Hello Java";
		String b="";
		String ar[]=a.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			b=b+ar[i]+" ";
		}
		
		System.out.println(b);

	}

}
