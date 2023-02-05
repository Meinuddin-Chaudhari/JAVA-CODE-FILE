
public class Student {
  
	 String sname;
	 Integer sage;
	 Integer sid;

	
	public Student(String sname, Integer sage, Integer sid) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.sid = sid;
	}


	@Override
	public String toString() {
		return "sname=" + sname + ", sage=" + sage + ", sid=" + sid;
	}



	

	

	

	
}
