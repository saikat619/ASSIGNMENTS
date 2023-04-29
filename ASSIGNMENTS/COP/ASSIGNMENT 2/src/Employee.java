import java.util.Scanner;
public class Employee {
private int id;
private String name;
private Date dob;
public void AcceptData(int id,String name,int day,int month,int year) {
	dob =new Date();
	dob.getdate(day,month,year);
	this.id = id;
	this.name=name;
}
public void display_data() {
	System.out.println("employee id=.........."+id);
	System.out.println("employee name =......."+name);
	System.out.println("the date of birth is..");
	dob.show_date();
}
}
