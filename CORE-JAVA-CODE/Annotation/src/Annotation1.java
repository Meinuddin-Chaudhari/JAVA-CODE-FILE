import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	String Country() default "india";
	int  run() default 2000;
	
//	String Country();
//	int  run();
}	

//@CricketPlayer(Country="india" ,run=4000)
@CricketPlayer
class ViratKohli
{	
	private String name;
	private int inning;
	
	public String getName() {
		return name;
	}
	public int getInning() {
		return inning;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setInning(int inning) {
		this.inning = inning;
	}
}
public class Annotation1 {
	public static void main(String[] args) {
		ViratKohli vk=new ViratKohli();
		
		vk.setInning(50);
		vk.setName("kohli");
		System.out.println(vk.getInning());
		System.out.println(vk.getName());
		
		Class c=vk.getClass();
		Annotation an=c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp=(CricketPlayer)an;
		System.out.println(cp.run());
		System.out.println(cp.Country());
	}
}
