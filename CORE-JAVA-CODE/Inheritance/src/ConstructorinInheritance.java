class Parent16
{
	int a, b;
	
	
	Parent16(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}	
}
class Child10 extends Parent16
{	
	int x, y;
	
	Child10()
	{
		super(111,222);
		x=100;
		y=200;
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);		
	}
}
public class ConstructorinInheritance {
	public static void main(String[] args) {
		Child10 ch=new Child10();
		ch.disp();	
	}
}
