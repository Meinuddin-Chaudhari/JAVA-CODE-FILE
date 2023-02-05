class Student
{
	
	private Student() {
		System.out.println("constructor");
	}
}
public class Test {
	public static void main(String[] args) throws Exception {
		
		//Take the input of the classname for which object has to be created at the runtime
		String className = args[0];

		//Load the class file explicitly
		Class c = Class.forName(className);
	
		//for the loaded class object is created using zero param constructor only
		Object obj=c.newInstance();

		//Perform type casting to get Student Object
		Student std = (Student)obj;
			 
	}
}