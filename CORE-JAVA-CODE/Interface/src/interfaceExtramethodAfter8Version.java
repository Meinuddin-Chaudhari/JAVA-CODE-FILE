interface vehicle
{
	void tier();
	void seat();
	
	default void disp1()
	{
		System.out.println("inside disp1");
		disp3();
	}
	static void disp2()
	{
		System.out.println("inside disp2");
		disp4();
	}
	private void disp3()
	{
		System.out.println("inside disp3");
	}
	private static void disp4()
	{
		System.out.println("inside disp4");
	}
}

class car implements vehicle
{
	public void tier()
	{
		System.out.println("inside tier");
	}
	public void seat()
	{
		System.out.println("inside seat");
	}
}
public class interfaceExtramethodAfter8Version {

	public static void main(String[] args) {
		
		car c=new car();
		c.tier();
		c.seat();
		c.disp1();
		vehicle.disp2();
		

	}

}
