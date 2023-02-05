class Parent1
{
	String name ="meinuddin";
	int age = 25;
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

class Child4 extends Parent1
{
	
}
class Child5 extends Parent1
{
	
}
	
public class HierarchicalInhertance {

	public static void main(String[] args) {
		 Child4 c =new Child4();
	      c.disp();
	      
	      Child5 d =new Child5();
	      d.disp();
	}

}
