package employeeManagementsystem;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EmployeeDomain {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;
	private String employeeName;
	private String employeeDepartement;
	private String employeeDesignation;
	private int employeeSalary;
	
	
	public void properties(int employeeId, String employeeName, String employeeDepartement,
			 String employeeDesignation,int employeeSalary) {
		this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeDepartement = employeeDepartement;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeDepartement() {
		return employeeDepartement;
	}


	public void setEmployeeDepartement(String employeeDepartement) {
		this.employeeDepartement = employeeDepartement;
	}


	public String getEmployeeDesignation() {
		return employeeDesignation;
	}


	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}


	public int getEmployeeSalary() {
		return employeeSalary;
	}


	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	

}
