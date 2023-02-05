class outer
{
	public void disp()
	{
		System.out.println("outer class method");
	}
	
	 class inner // Inner Class
	{
			public void set()
		{
			System.out.println("inner class method");
		}
	}	
}
public class InnerclassAnonymousclass {
	public static void main(String[] args) {
		
		outer ou =new outer();
		ou.disp();
		
 outer.inner in=ou.new inner();// ->IF inner class is non static
	                           //Then outer class object is used creatinjg object of inner class
 
 // outer.inner in=new outer.inner();// ->IF inner class is non static
 //Then outer class object is used creatinjg object of inner class
 in.set();
	}
}
