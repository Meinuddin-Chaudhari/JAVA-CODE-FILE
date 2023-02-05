class Parent
{
	
	 String name ="meinuddin";
	int age = 25;
	
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
class Child extends Parent
{
	
}

public class SingleInheritance {
	public static void main(String[] args) {
     Child c =new Child();
      c.disp();

	}
}
