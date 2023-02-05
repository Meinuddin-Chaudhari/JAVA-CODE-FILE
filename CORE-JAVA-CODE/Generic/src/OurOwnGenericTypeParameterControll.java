class Student<T extends Number>
{
	
}
public class OurOwnGenericTypeParameterControll {

	public static void main(String[] args) {
		Student<Integer> s=new Student<Integer>();
		Student<Number> s1=new Student<Number>();
		//Student<String> s2=new Student<String>();
	}

}
