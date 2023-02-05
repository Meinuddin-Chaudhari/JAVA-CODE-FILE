//lambda Expression

@FunctionalInterface
interface Demo
{
	//void disp();
	//int disp(int i);
	int disp(int i,int j);	
}


public class LambdaExpression {

	public static void main(String[] args) {
		
		
		
	    /*Demo d=()->                                  
	    {
	    	System.out.println("hello");             //Zero parameter
	    };
		d.disp();*/
		
		
      /*Demo d=()-> System.out.println("hello");       //Zero parameter
	    d.disp();*/
	    	
		
		/*Demo d=( a)->                           
		{
			int res=a-5;                               //one parameter
			return res;
		};
		System.out.println(d.disp(10));	*/
		
		
		/*Demo d=  a-> a-7;                              //one parameter
		System.out.println(d.disp(10));	*/
			
		
		/*Demo d=( a,b)->
		{
			int c=a+b;                                   //two parameter
			return c;
		};
		System.out.println(d.disp(10, 20));*/
		
		
		Demo d=( a,b)->a+b;  
		System.out.println(d.disp(10, 20));               //two parameter		
	}
}
