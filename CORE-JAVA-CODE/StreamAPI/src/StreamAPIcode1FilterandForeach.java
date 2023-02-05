import java.util.*;
import java.util.stream.*;

public class StreamAPIcode1FilterandForeach {
	public static void main(String[] args){

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);

		//till jdk1.7v
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for ( Integer i1: al )
			if (i1%2==0)
				evenList.add(i1);
		System.out.println(evenList);

		//From JDK1.8V we use Streams
		List ls=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		ls.forEach(System.out :: println);
		
		
	}
}