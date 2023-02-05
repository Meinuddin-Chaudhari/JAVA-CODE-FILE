interface One1
{
   void methodOne1();
}

interface Two2
{
	void methodTwo2();
}
class sample
{
	public void disp() 
	{
	 System.out.println("sample");
	}
}

class Demo1 extends sample implements One1,Two2
{
	public void disp() 
	{
	 System.out.println("sample disp");
	}
 public void methodOne1()
 {	  
	   System.out.println("method one");
 }
 public void methodTwo2()
 {
	  System.out.println("method method");
 }
}

public class ClassExtendClassAndImplementMultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo1 d =new Demo1();
       d.methodOne1();
       d.methodTwo2();
       d.disp();
	}
}
