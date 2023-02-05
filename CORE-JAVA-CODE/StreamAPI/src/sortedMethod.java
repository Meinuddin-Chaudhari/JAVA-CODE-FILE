import java.util.*;
import java.util.stream.*;

public class sortedMethod {
	public static void main(String[] args){

		ArrayList<Integer> al =new ArrayList<Integer>();
			al.add(10);
			al.add(0);
			al.add(15);
			al.add(5);
			al.add(20);

		//using stream api
		List<Integer> ls= al.stream().sorted().collect(Collectors.toList());
		ls.forEach(System.out::println);

		System.out.println("***************");
		
		List<Integer> cls = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		cls.forEach(System.out::println);
	}
}

