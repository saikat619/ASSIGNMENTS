package com.app.org;

public class Manager extends Employee {
private double perfbonus;
public Manager() {}
public Manager(String firstname,String lastname,int deptid,double basic,double perfbonus) {
	super(firstname, lastname, deptid, basic);
	this.perfbonus=perfbonus;
}
public double getPerfbonus() {
	return perfbonus;
}
@Override
public double netSalary() {
	return (super.getBasic()+this.perfbonus);
}
@Override
public String toString() {
	return super.toString()+"\nNet Salary:"+this.netSalary();
}
}
