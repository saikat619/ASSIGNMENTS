package com.app.org;
import com.Interface.IPrintable;

public abstract class Employee implements IPrintable{
	private static int emp_count = 10000;
	private int id;
	private String firstName;
	String lastName;
	private int deptId;
	private double basic;

	public Employee() {
	}

	public Employee(String firstName, String lastName, int depId, double basic) {
		this.id = emp_count;
		emp_count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptId = depId;
		this.basic = basic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double updateBasic(double increment) {
		this.basic += increment;
		return this.basic;
	}

	public abstract double netSalary();

	public String toString() {
		return "employee Id:" + id + "\nfirst name:" + firstName + "\nlast name:" + lastName + "\nDepartment ID:"
				+ deptId;
	}

}
