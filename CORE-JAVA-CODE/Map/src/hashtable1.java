
import java.util.*;
import java.util.Hashtable;
class Ineuron5
{
	int i;
	public Ineuron5(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+ "";
	}	
}
public class hashtable1{
	public static void main(String[] args) {
		
		Hashtable ht=new Hashtable();
		ht.put(11, "Hyder");
		ht.put(12, "Nitin");
		System.out.println(ht);
		
		Hashtable ht2=new Hashtable();
		ht2.put(new Ineuron5(11), "Hyder");
		ht2.put(new Ineuron5(12), "Nitin");
		ht2.put(new Ineuron5(13), "Navin reddy");
		
		System.out.println(ht2);
		//Hashtable java1.0
		//HashMap java 1.2
		
		//Hashtable - synchronized (Multithreading not possible
		//HashMap - non synchronized (Multithreading possible
		
		//Hashtable - Thread safe
		//HashMap - not safe
		
		//Hashtable - Low performance
		//HashMap - High performance
	}
}