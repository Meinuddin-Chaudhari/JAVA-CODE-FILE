
public class StringConvert3 {

	public static void main(String[] args) {
	
				String a="Ineuron java";
				String b="";
				String ar[]=a.split(" ");
				
				for(String ele:ar)
				{
			      	for(int i=ele.length()-1;i>=0;i--)
				    {
					b=b+ele.charAt(i); 
				    }
			      	b=b+" ";
				}
				 System.out.println(b);
	}
}
