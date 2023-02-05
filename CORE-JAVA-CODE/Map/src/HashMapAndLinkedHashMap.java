import java.util.*;
import java.util.Map.Entry;
public class HashMapAndLinkedHashMap {

	public static void main(String[] args) {
		
		
		//order of insertion is not preserved
		HashMap hm=new HashMap();
		hm.put(10, "Ayan");
		hm.put(30, "Jishan");
		hm.put(50, "Rehan");
		hm.put(70, "meinu");
		
		System.out.println(hm);
		
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
			String st=(String) itr2.next();
			System.out.println(st);
		}
		
		System.out.println("************************************");
		//Accessing both key and value
		System.out.println("Accessing both key and value:");
		Set se=hm.entrySet();
		Iterator itr3=se.iterator();
		while(itr3.hasNext())
		{
			Map.Entry mp=(Entry) itr3.next();
			System.out.println(mp.getKey()+" : "+mp.getValue());
		}
	
		
		
				

	}

}
