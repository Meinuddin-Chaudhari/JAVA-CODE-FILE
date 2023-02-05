class Parent12
{
	String name ="meinuddin";
	int age = 25;
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
}
class Child6 extends Parent12
{
	
}
class Child7 extends Parent12
{
	
}
class Child8 extends Child6
{
	
}
public class HybridInheritance {

	public static void main(String[] args) {
		
	      Child8 d =new Child8();
	      d.disp();
	}
}
