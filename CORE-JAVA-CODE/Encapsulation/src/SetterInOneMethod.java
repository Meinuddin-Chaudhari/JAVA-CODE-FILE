  class tcsc
{
	private String name;
	private int age;
	
	public void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}	
}
public class SetterInOneMethod {
   public static void main(String[] args) {
		
     tcsc s1 =new tcsc();
     
     s1.setData("meinu",25);
   String  s2=s1.getName();
   System.out.println(s2);
   
  
   int  s3=s1.getAge();
   System.out.println(s3);
	}
}