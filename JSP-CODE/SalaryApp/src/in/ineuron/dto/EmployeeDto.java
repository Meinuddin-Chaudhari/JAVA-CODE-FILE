package in.ineuron.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private String ename;
	private Integer eno;
	private Integer bsalary;
	private float grossSalary;
	private float netSalary;

	static {
		System.out.println("EmployeeDto .class file is loading...");
	}

	public EmployeeDto() {
		System.out.println("EmployeeDto:: Zero param constructor...");
	}

	public String getEname() {
		System.out.println("EmployeeDto.getEname()");
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("EmployeeDto.setEname()");
		this.ename = ename;
	}

	public Integer getEno() {
		System.out.println("EmployeeDto.getEno()");
		return eno;
	}

	public void setEno(Integer eno) {
		System.out.println("EmployeeDto.setEno()");
		this.eno = eno;
	}

	public Integer getBsalary() {
		System.out.println("EmployeeDto.getBsalary()");
		return bsalary;
	}

	public void setBsalary(Integer bsalary) {
		System.out.println("EmployeeDto.setBsalary()");
		System.out.println();
		this.bsalary = bsalary;
	}

	public float getGrossSalary() {
		System.out.println("EmployeeDto.getGrossSalary()");
		return grossSalary;
	}

	public void setGrossSalary(float grossSalary) {
		System.out.println("EmployeeDto.setGrossSalary()");
		this.grossSalary = grossSalary;
	}

	public float getNetSalary() {
		System.out.println("EmployeeDto.getNetSalary()");
		System.out.println();
		return netSalary;
	}

	public void setNetSalary(float netSalary) {
		System.out.println("EmployeeDto.setNetSalary()");
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "EmployeeDto [ename=" + ename + ", eno=" + eno + ", bsalary=" + bsalary + ", grossSalary=" + grossSalary
				+ ", netSalary=" + netSalary + "]";
	}

}
