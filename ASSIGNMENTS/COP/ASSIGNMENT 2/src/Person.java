public class Person {
private String first_name,last_name;
private String city;
private int age;
public void Person_Data(String first_name,String last_name,String city,int age) {
	this.first_name=first_name;
	this.last_name=last_name;
	this.city = city;
	this.age=age;
}
void ShowData() {
	System.out.println("Name:"+first_name+last_name);
	System.out.println("city:"+city);
	System.out.println("age"+age);
}

}
