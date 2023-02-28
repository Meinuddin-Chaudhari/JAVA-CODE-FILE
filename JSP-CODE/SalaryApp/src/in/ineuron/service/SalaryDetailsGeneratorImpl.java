package in.ineuron.service;

import in.ineuron.dto.EmployeeDto;

public class SalaryDetailsGeneratorImpl implements SalaryDetailsGenerator {
	
	static {
		System.out.println("SalaryDetailGeneratorImpl.class file is loading...");
	}

	public SalaryDetailsGeneratorImpl() {
		System.out.println("SalaryDetailsGeneratorImpl object is created...");
	}
	
	@Override
	public void generateSalaryDetails(EmployeeDto dto) {
		// generate grossSalary and netSalary
		float grossSalary = dto.getBsalary() + (dto.getBsalary() * 0.3f);
		float netSalary = grossSalary - (dto.getBsalary() * 0.2f);

		// set those values into DTO
		dto.setGrossSalary(grossSalary);
		dto.setNetSalary(netSalary);

	}
}
