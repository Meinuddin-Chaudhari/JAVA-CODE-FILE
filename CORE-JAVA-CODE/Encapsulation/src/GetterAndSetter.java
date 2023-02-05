class Student
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class GetterAndSetter {
   public static void main(String[] args) {
		
     Student s1 =new Student();
     
    s1.setName("Ayan");
   String  s2=s1.getName();
   System.out.println(s2);
   
   s1.setAge(15);
   int  s3=s1.getAge();
   System.out.println(s3);
	}
}
