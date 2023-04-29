package pkg;

public class Student {
	private static int stu_count=0;
    private int roll_no;
    private String stu_name;
    private String address;
    public Student(){}
    public Student(String name,String address) {
    	stu_count++;
    	roll_no=stu_count;
    	this.stu_name=name;
    	this.address=address;
    }
	public int getRoll_no() {
		return roll_no;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return"student name :"+stu_name
						  + "Roll no. :"+roll_no
						  + "Address :"+address;
	}
}
