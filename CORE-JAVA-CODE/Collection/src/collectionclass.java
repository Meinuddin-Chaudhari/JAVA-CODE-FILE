import java.util.*;
public class collectionclass {
	public static void main(String[] args) 
	{	 
		 ArrayList al=new ArrayList();
		 al.add(100);
		 al.add(50);
		 al.add(150);
		 al.add(25);
		 al.add(75);
	
		 //Collection vs Collections
		 
		 Collections.sort(al);
		 System.out.println(al);
		 
		 ArrayList<String> al2=new ArrayList<String>();
		// al2.add(28); error
		 al2.add("Hyder");
		 al2.add("ineuron");
		 al2.add("Najafi code");
		//error al2.add(560025);
		 
		 Collections.sort(al2);
		 System.out.println(al2);
		
		 //few more important inbuit methods of Collections class
		 
		 ArrayList al4=new ArrayList();
		 al4.add(10);
		 al4.add(20);
		 al4.add(30);
		 al4.add(40);
		int index= Collections.binarySearch(al4, 40);
		System.out.println(index);
		Collections.shuffle(al4);
		System.out.println(al4);
		
		System.out.println(Collections.frequency(al4, 40));		 
	}
}