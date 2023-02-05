import java.util.*;
class Employee
{
	private int empid;
	private String name;
	private String empAddr;
	
	@Override
	public String toString()
	{
		return "hyder";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Garbage Collector collected the object");
	}
}
public class HashMapGarbageCollector 
{
	public static void main(String[] args)throws Exception 
	{		
		Employee e=new Employee();
		HashMap hm=new HashMap();
		hm.put(e, "Hyder");
		
		//Statements
		e=null; //eleigible for garbage collection
		System.gc();//call to GC
		
		System.out.println(hm);			
	}
}