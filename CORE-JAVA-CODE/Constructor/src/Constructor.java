
class Student
{
	private String name;
	private int age;
	
	public Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public void disp()
	{
		System.out.println(name);
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
public class Constructor {
   public static void main(String[] args) {
		
     Student s1 =new Student("gishan",10);
     s1.disp();
    
   String  s2=s1.getName();
   System.out.println(s2);
   
  
   int  s3=s1.getAge();
  System.out.println(s3);
	}
}
