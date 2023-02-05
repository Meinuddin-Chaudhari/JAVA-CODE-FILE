class Parentt
{
	String name ="meinuddin";
	int age = 25;
	
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

class Child3 extends Parentt
{
	
}
class Child1 extends Child3
{
	
}
public class MultileveLInheritance {
	public static void main(String[] args) {
		  Child1 c =new Child1();
	      c.disp();
	}
}
