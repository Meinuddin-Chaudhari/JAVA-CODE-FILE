
public class AutoboxingAndAutoUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Autoboxing
		Integer i=10;
		//     |
		//     |
		// Integer i=Integer.valueOf(10);
		System.out.println(i);
		
		//AutoUnboxing
		Integer s=new Integer(20);
         //	    |
	     //     |
		//int p=s.intValue();
		int p=s;
		System.out.println(p);
	}

}
