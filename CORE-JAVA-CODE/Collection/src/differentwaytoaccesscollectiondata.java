import java.util.*;

public class differentwaytoaccesscollectiondata {
	public static void main(String[] args) {	
		LinkedList al2=new LinkedList();
		al2.add(10);
   	    al2.add(20);
		al2.add(30);
		al2.add("meinu");
			
		
		//normal loop
		System.out.println("normal loop");
		for(int i=0;i<al2.size();i++)
		{
			Object o= al2.get(i);
			Integer o1= (Integer) al2.get(i);
			System.out.println(o);	
		}
			
		//for each
		System.out.println("foreach loop");
		for(Object obj:al2)
		{
			System.out.println(obj+ " ");
		}
		
		
		 //iterator
        System.out.println("iterator");        
 	    Iterator itr1=al2.iterator();
 	   
 	    
		while(itr1.hasNext())
		{
			Object i= itr1.next();			
			System.out.println(i);	
		}
		
		//listiterator
		System.out.println("reverse");
		ListIterator litr = al2.listIterator(al2.size());
		while(litr.hasPrevious())
		{
			Object ob=litr.previous();
			System.out.println(ob);
		}
		
		//descending iterator
				System.out.println("descending iterator");
				Iterator it=al2.descendingIterator();
				while(it.hasNext())
				{
					Integer itt=(Integer) it.next();
					System.out.println(itt);
				}
		
		
		// what if I want to reverse or access data of other clases in reverse dir?
		System.out.println("reverse using list iterator");
		TreeSet ad=new TreeSet();
		ad.add(100);
		ad.add(200);
		ad.add(300);
		ad.add(400);
		
		LinkedList ll=new LinkedList();
		ll.addAll(ad);
		
		ListIterator litr2=ll.listIterator(ll.size());		
		
		while(litr2.hasPrevious())
		{
			Integer itg=(Integer) litr2.previous();	
			System.out.println(itg);
		}	
		
		
	}
}