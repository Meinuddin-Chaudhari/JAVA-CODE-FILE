class calc4
{
	int c;
	int add(int a,int b) 
	{
	c=a+b;
	return c;
	}
	
}

public class MethodType4
{
	public static void main(String[] args)
	{  
		int p;
		calc4 res=new calc4();
		p=res.add(30,40);
		System.out.println(p);
	}

}
