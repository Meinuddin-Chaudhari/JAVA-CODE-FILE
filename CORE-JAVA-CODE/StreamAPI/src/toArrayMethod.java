import java.util.*;
import java.util.stream.*;

public class toArrayMethod {
	public static void main(String[] args){

		ArrayList<Integer> al =new ArrayList<Integer>();
			al.add(10);
			al.add(0);
			al.add(15);
			al.add(5);
			al.add(20);

		Object[] objArr = al.stream().toArray();
		for(Object obj: objArr)
			System.out.println(obj);

		System.out.println("***********");

		Integer[] objArr1 = al.stream().toArray(Integer[]::new);
		for(Integer obj1: objArr1)
			System.out.println(obj1);
		
	}
}