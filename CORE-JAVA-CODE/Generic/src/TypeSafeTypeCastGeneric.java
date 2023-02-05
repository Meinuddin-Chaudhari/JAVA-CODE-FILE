import java.util.ArrayList;

public class TypeSafeTypeCastGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		//Type Safe
		al.add("good");
		al.add("morning");
		
		//Type Cast not required because Type Safe
		String a= al.get(0);
		System.out.println(a);
		
		String a1= al.get(1);
		System.out.println(a1);
		
	}

}
