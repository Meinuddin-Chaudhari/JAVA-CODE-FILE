
package comparable;

import java.util.*;
//Write a Program to Insert String Objects into the TreeSet where the Sorting Order
//is of  Reverse of Alphabetical Order:
class  Q1Comparator {
	public static void main(String[] args) {
			TreeSet t = new TreeSet(new MyComparator1());
			t.add("sachin");
			t.add("ponting");
			t.add("sangakara");
			t.add("fleming");
			t.add("lara");
			System.out.println(t);
	}
}
class   MyComparator1 implements Comparator {
		public  int compare(Object obj1, Object obj2) {
				//String s1 = obj1.toString();
				String s1 = (String)obj1;
				String s2 = (String)obj2;
			
			return -s1.compareTo(s2);
	}
}
