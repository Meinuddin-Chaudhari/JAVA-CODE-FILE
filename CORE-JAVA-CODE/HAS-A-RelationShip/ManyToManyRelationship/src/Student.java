public class Student {

	private String sid;
	private String sname;
	private String saddr;
	
	Course [] course;

	public Student(String sid, String sname, String saddr, Course[] course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
	}
	public void disp()
	{
		System.out.println("--Student Detail--");
		System.out.println("Student id   ::"+sid);
		System.out.println("Student name ::"+sname);
		System.out.println("Student addr ::"+saddr);
		System.out.println("--Course detail-- ");
		for(Course ele:course)
		{
			System.out.println("course id   ::"+ele.cid);
			System.out.println("course name ::"+ele.cname);
			System.out.println("course cost ::"+ele.ccost);		
		}
		System.out.println("-----------------------------------------------");
	}
}
