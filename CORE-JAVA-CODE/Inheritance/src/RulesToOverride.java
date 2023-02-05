class Demo111
{
	void disp()
	{
		System.out.println("Demo in Parent");
	}
	public void disp2()
	{
		
	}
	public int add()
	{
		return 10+2;
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	
	
}

class Demo222 extends Demo111
{
	public void disp()// we can increase visibility
	{
		
	}
//	void disp2() we cannot reduce visbility
//	{
//		
//	}
//	public void add() return type cannot be changed
//	{
//		System.out.println("Child");
//	}
//	public int add(int a, int b) parameter should be same
//	{
//		return a+b;
//	}
	
	public int add(int a)
	{
		return a;
	}
}



public class RulesToOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
