
class calc1
{
	int a,b,c;
	
	void add() {
		a=10;
		b=20;
	   
	   c=a+b;
		System.out.println(c);
	}
}

public class MethodType1 
{
	public static void main(String[] args) {
		   
		calc1 res=new calc1();
		res.add();
		
	}
}
