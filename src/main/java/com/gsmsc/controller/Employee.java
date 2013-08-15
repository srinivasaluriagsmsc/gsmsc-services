package com.gsmsc.controller;

public class Employee {
	
	private String employeeName;
	private String empId;
	
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}



	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}



	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

public Employee()
{
	this.empId= "1008";
	this.employeeName = "Vasu";
}

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Emp Id : " + employee.getEmpId());
		System.out.println("Emp Name : " + employee.getEmployeeName());
	}

}
