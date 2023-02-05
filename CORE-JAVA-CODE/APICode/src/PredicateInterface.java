import java.util.function.*;


//public class PredicateInterface {
//	public static void main(String[] args){
//		
//		int[] arr = {0,5,10,15,20,25,30};
//
//		Predicate<Integer> p1 = i-> i>10;
//		System.out.println("Elements greater than 10 are :: ");
//		m1(p1,arr);
//
//		Predicate<Integer> p2 = i-> i%2==0;
//		System.out.println("Elements which are even no :: ");
//		m1(p2,arr);
//
//		
//		System.out.println("Elemnts which are greater than 10 and should be even no");
//		m1(p1.and(p2),arr);
//
//		System.out.println("Eleemnts which are greater than 10 or should be even no");
//		m1(p1.or(p2),arr);
//
//		System.out.println("The elements which are not even are :: ");
//		m1(p2.negate(),arr);
//	}
//
//	public static void m1(Predicate<Integer> p , int[] x){
//		for (int ele: x )
//			if (p.test(ele))//ele-> ele>10
//				System.out.println(ele);	
//	}
//}