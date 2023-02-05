package comparable;


//Write a Program to Insert String and StringBuffer Objects into the TreeSet where Sorting Order is Increasing Length Order. 
//If 2 Objects having Same Length then Consider their Alphabetical Order:
//eg: A,ABC,AA,XX,ABCE,A
//
//output: A,AA,XX,ABC,ABCE


import  java.util.*;
class  Q3Comparator{
public static void main(String[] args) {
			TreeSet t = new TreeSet(new MyComparator3());
			t.add("A");
			t.add(new StringBuffer("ABC"));
			t.add(new StringBuffer("AA"));
			t.add("XX");
			t.add("ABCE");
			t.add("A");
			System.out.println(t);
	}
}
class  MyComparator3 implements Comparator {
	public	int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		int i1 = s1.length();
		int i2 = s2.length();
		
		if(i1 < i2)return -1;
		
		else if(i1 > i2)return 1;
		
		else
			return s1.compareTo(s2); 
	}
}
