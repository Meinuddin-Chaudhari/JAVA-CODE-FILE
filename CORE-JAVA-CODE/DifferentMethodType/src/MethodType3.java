class calc3{
	
    int add() 
    {
    	int a=10,b=50,c;
    	c=a+b;
    	return c;
    }
}

public class MethodType3 {

	public static void main(String[] args) {
		 int p;
		calc3 res=new calc3();
		p=res.add();
		System.out.println(p);
	}
}
