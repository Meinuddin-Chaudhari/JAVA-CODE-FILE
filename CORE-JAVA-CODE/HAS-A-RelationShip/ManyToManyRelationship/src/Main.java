public class Main {
 public static void main(String[] args) {
		
		Course c1=new Course("AA1", "java", 2000);
		Course c2=new Course("BB2", "phython", 3000);
		Course c3=new Course("CC4", "blockchain", 1000);
				
		Course [] cr=new Course[3];
		cr[0]=c1;
		cr[1]=c2;
		cr[2]=c3;
		
		Student s1=new Student("987", "ayan","nallasopara", cr);
		Student s2=new Student("679", "jishan","malad", cr);
		Student s3=new Student("421", "rehan","mira road", cr);
		s1.disp();
		s2.disp();
		s3.disp();
		
	}
}
