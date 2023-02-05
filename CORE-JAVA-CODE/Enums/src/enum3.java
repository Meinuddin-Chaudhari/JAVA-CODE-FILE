enum course
{
	JAVA,JEE,SPRINGBOOT;
	int courseid;
	course()
	{
		System.out.println("constructor called");
	}
	
	void setCourseId(int courseid)
	{
		this.courseid=courseid;
	}
	int getCourseId()
	{
		return courseid;
	}
}
public class enum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       course.JAVA.setCourseId(10);
	             int cid= course.JAVA.getCourseId();
	   System.out.println(cid);
		
	}

}



