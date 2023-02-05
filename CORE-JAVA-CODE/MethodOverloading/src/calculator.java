//method overloading also called earlybinding and compile time polymorphism
class Calc
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	float add(float a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b,float c)
	{
		return a+b+c;
	}
	float add(int a,float b,float c)
	{
		return a+b+c;
	}
	float add(float a,int b, int c)
	{
		return a+b+c;
	}
	double add(int a,float b,double c)
	{
		return a+b+c;
	}
	double add(float a,float b,double c)
	{
		return a+b+c;
	}
}

public class calculator 
{
public static void main(String args[])
{
	Calc calc1 = new Calc();
       
       int a=10,b=20,c=30;
       float m=10.5f,n=20.5f,o=30.5f;
       double x=15.;
       
       System.out.println(calc1.add(a,b));
       System.out.println(calc1.add(m,n));
       System.out.println(calc1.add(a,m));
       System.out.println(calc1.add(m,a));
       System.out.println(calc1.add(a,b,c));
       System.out.println(calc1.add(m,n,o));
       System.out.println(calc1.add(a,m,n));
       System.out.println(calc1.add(m,a,b));
       System.out.println(calc1.add(a,m,x));
       System.out.println(calc1.add(m,n,x));
       
       
	}
}
