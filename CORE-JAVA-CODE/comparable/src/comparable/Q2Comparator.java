
package comparable;


//Write a Program to Insert StringBuffer Objects into the TreeSet where 
//Sorting Order is Alphabetical Order:
import  java.util.*;
class  Q2Comparator  {
		public static void main(String[] args) {
				TreeSet t = new TreeSet(new MyComparator2());
				t.add(new StringBuffer("A"));
				t.add(new StringBuffer("Z"));
				t.add(new StringBuffer("K"));
				t.add(new StringBuffer("L"));
				System.out.println(t);
	}
}
class MyComparator2 implements Comparator {
		public int compare(Object obj1, Object obj2) {
				String s1 = obj1.toString();
				String s2 = obj2.toString();
			
				return s1.compareTo(s2); //[A, K, L, Z]
	}
}
