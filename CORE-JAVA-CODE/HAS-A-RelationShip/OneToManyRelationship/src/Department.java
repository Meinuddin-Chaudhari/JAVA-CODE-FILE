public class Department {

	private Integer dId;
	private String dName;
	private Employee[] emps;
	
	public Department(Integer dId, String dName, Employee[] emps) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.emps = emps;
	}
	public void DepartmentDetail()
	{
		System.out.println("Department Details");
		System.out.println("Department Id::"+dId);
		System.out.println("Department Name::"+dName);
		System.out.println("------------------------------------------------");
		System.out.println("Employee Detail");
		for(Employee employee:emps)
		{
			System.out.println("Employee id::"+employee.eId);
			System.out.println("Employee id::"+employee.eName);
			System.out.println("Employee id::"+employee.eAddress);
			System.out.println("------------------------------------------------");
		}
		System.out.println();		
	}	
}
