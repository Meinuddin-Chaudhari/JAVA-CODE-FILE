import java.util.*;
import java.util.Map.Entry;

class Details
{
	private String name;
	private Integer age;
	private String addr;
	
	public Details(String name, Integer age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	@Override
	public String toString() {
		return " name=" + name + ", age=" + age + ", addr=" + addr ;
	}	
	
}
public class HashMap2 {

	public static void main(String[] args) {
		
      Details d1=new Details("meinu",20,"mumbai");
      Details d2=new Details("Ayan",25,"goa");
      Details d3=new Details("jishan",15,"banglore");
      
      HashMap hm=new HashMap();
      hm.put(30, d1);
      hm.put(60, d2);
      hm.put(90, d3);
     
      
      System.out.println("************************************");
		//accessing only key
		System.out.println("Accessing only key:");
		Set s=hm.keySet();
		Iterator itr1=s.iterator();
		while(itr1.hasNext())
		{
			Integer i=(Integer) itr1.next();
			System.out.println(i);
		}
		
		System.out.println("************************************");
		//accessing only value
		System.out.println("Accessing only value:");
		Collection c=hm.values();
		Iterator itr2=c.iterator();
		
		while(itr2.hasNext())
		{
			Object st= itr2.next();
			System.out.println(st);
		}
		System.out.println("************************************");
		System.out.println("Accessing  key and value:");
     Set se=hm.entrySet();
     Iterator itr3=se.iterator();
     while(itr3.hasNext())
     {
    	 Map.Entry mp=(Entry) itr3.next();
    	 System.out.println(mp.getKey()+" : "+mp.getValue());
     }
   
     System.out.println("************************************");
	}

}
