class Gen<T>
{
	T obj;
	
	Gen(T obj)
	{
		this.obj=obj;
	}
	
	public void show()
	{
		System.out.println(obj.getClass().getName());
	}
	T getObject()
	{
		return obj;
	}
}
public class OurOwnGenericClass {
	public static void main(String[] args) {
		
		Gen<Integer> g=new Gen<Integer>(10);
		System.out.println(g.getObject());
	     g.show();
		
		Gen<String> g1=new Gen<String>("meinu");
		System.out.println(g1.getObject());
		 g1.show();
	}
}
