package classImplementation;
public class Employee {
private int id;
private String name;
private Date dob;
public  Employee() {
	// TODO Auto-generated constructor stub
	dob=new Date();
} 
public Employee(int id,String name,int day,int month,int year) {
	this.id = id;
	this.name=name;
	this.dob= new Date(day,month,year);
}
public void display_data() {
	System.out.println("employee id=.........."+id);
	System.out.println("employee name =......."+name);
	System.out.println("the date of birth is..");
	dob.show_date();
}
}
