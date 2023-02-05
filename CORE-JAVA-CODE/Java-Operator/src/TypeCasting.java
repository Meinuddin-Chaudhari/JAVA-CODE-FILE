
public class TypeCasting {

	public static void main(String[] args) {
		//typecasting
		
		byte num1=45;
		double num2;
		num2=num1;//implicit typecasting
		System.out.println(num2);
		
		double m=45.5;
		byte k;
		
		k=(byte) m;//explicit typecasting
		System.out.println(k);

	}

}
