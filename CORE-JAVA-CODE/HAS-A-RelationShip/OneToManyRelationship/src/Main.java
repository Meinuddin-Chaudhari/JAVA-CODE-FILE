public class Main {

	public static void main(String[] args) {
		
		Employee e1 =new Employee(56, "ayan","nallasopara");
		Employee e2 =new Employee(30, "jishan","mira road");
		Employee e3 =new Employee(90, "rehan","malad");
		
		Employee [] em=new Employee[3];
		em[0]=e1;
		em[1]=e2;
		em[2]=e3;
		Department d =new Department(652,"soaib", em);
		d.DepartmentDetail();
	}
}
