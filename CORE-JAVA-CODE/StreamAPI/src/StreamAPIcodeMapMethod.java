import java.util.*;
import java.util.stream.*;

public class StreamAPIcodeMapMethod {
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(0);
			al.add(5);
			al.add(10);
			al.add(15);
			al.add(20);

			// till JDK1.7V
			ArrayList<Integer> doubleList = new ArrayList<Integer>();
			for ( Integer i1: al )
				doubleList.add(i1*2);	
			//System.out.println(doubleList);

			// from JDK1.8V
			List ls=al.stream().map(i3->i3*2).collect(Collectors.toList());
			ls.forEach(i-> System.out.println(i));

			ls.forEach(System.out::println);
	}
}