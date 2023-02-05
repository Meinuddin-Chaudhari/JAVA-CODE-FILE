
interface Student
{
	void display();

}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Student s=new Student()
				{
			      public void display()
			      {
			    	 System.out.println("hello");
			      }
				};
             s.display();
        
	}

}
