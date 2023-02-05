
class outerr
{
 public void disp()
	{
		System.out.println("outer class method");
	}
	
	
}
public class Anonymousclass {
	public static void main(String[] args) {
		
		outerr ou =new outerr()
				{
			        public void disp()
			        {
			        	System.out.println("inside Anonymous class youu");
			        }
				};
		ou.disp();
		
	}
}
