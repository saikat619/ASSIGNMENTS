package com.app.org;
import java.util.Scanner;
public class Worker extends Employee {
	private int working_hours;
	private double hourlyrate;
	public Worker() {
		super();
	}

	public Worker(String firstname, String lastname, int deptid, double basic, double hourlyrate) {
		super(firstname, lastname, deptid, basic);
		this.hourlyrate = hourlyrate;
		this.working_hours = 0;
	}

	public double getHourlyrate() {
		return hourlyrate;
	}
	
	public int getWorking_hours() {
		return working_hours;
	}

	public void setWorking_hours(int working_hours) {
		this.working_hours = working_hours;
	}

	@Override
	public double netSalary() {
		return (super.getBasic()+(this.hourlyrate*this.working_hours));
	}
	@Override
	public String toString() {
		return super.toString()+"\nNet salary:"+this.netSalary();
	}

	@Override
	public void print() {
		System.out.println("this is worker class");
	}

	@Override
	public boolean isEquals(Object obj) {
		Worker w = (Worker)obj;
		if(this.netSalary()==w.netSalary())
			return true;
		else
		return false;
	}
	
	
}
