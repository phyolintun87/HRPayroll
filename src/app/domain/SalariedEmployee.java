package app.domain;

import java.time.LocalDate;

import app.business.visitor.IPayslipVisitor;

/**
 * 
 * @author luungocha bui
 *
 */
public class SalariedEmployee extends Employee implements EmployeeCloneable{

	public SalariedEmployee(String empCode, String firstName, String lastName, String zipcode, String phone,
			String email, LocalDate dateOfBirth, String ssn, String position, LocalDate joinDate, LocalDate resignDate,
			Boolean isRegign, Boolean isPermanent, Address address, Department department, Branch branch, Double salary) {

		super(empCode, firstName, lastName, zipcode, phone, email, dateOfBirth, ssn, position, joinDate, resignDate,
				isRegign, isPermanent, address, department, branch, salary);
	}

	@Override
	public void accept(IPayslipVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public EmployeeCloneable doClone() {
		return new SalariedEmployee(empCode, firstName, lastName, zipcode, phone, email, dateOfBirth, ssn, position,
				joinDate, resignDate, isRegign, isPermanent, address, department, branch, basicSalary);
	}

}
