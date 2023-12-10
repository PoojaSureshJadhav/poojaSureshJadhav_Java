package gl.java.question1a;

import java.io.Serializable;

public class Employee implements Serializable  {

	//Create Variables
	private String employeeId;
	private String employeeName;
	private String employeePhone;
	private String employeeAddress;
	private int employeeSalary;

	// Constructor
	public Employee(String employeeId, String employeeName, String employeePhone, String employeeAddress, int employeeSalary) {
		//super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeAddress = employeeAddress;
		this.employeeSalary = employeeSalary;
	}

	// getters, setters
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}	

}
