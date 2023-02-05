
public class ValueOfMethod {

	public static void main(String[] args) {
	
        //String data
		Integer i=Integer.valueOf("10");
		System.out.println(i);
		
		Double i1=Double.valueOf("10.5");
		System.out.println(i1);
		
		Boolean i2=Boolean.valueOf("nitin");
		System.out.println(i2);
		
		
		//int data
		Integer a=Integer.valueOf(20);
		System.out.println(a);
		Character c=Character.valueOf('a');
		System.out.println(c);
		
		
		//String ,int radix
		
		Integer s=Integer.valueOf("1111",2);
		System.out.println(s);
		
		Integer s1=Integer.valueOf("15",10);
		System.out.println(s1);
	}
	

}
