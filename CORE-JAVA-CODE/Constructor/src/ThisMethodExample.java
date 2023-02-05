 class Studentt
{
	private String name;
	private int age;
	public Studentt(String name,int age)
	{
		this();
		this.name=name;
		this.age=age;
	}
	public Studentt()
	{
		name="hiba";
		age=30;	
	}
	public String getName() {
		return name;
	}
    public int getAge() {
		return age;
	}	
}
public class ThisMethodExample {
   public static void main(String[] args) {
		
	   Studentt s1 =new Studentt("jj",67);
	   Studentt s2 =new Studentt();
   String  s5=s2.getName();
   System.out.println(s5);
   
   int  s6=s2.getAge();
   System.out.println(s6);
	}
}