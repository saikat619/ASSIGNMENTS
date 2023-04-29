/*3. Create a class Person with data members as name, age, city. Write getters and setters for all the data 
members. Also add the display function. Create Default and Parameterized constructors. Create the 
object of this class in main method and invoke all the methods in that class.*/
import java.util.Scanner;
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first_name,last_name;
		String city;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		first_name=sc.next();
		System.out.println("enter last name");
		last_name=sc.next();
		System.out.println("enter city");
		city=sc.next();
		System.out.println("enter age");
		age=sc.nextInt();
		Person p= new Person();
		p.Person_Data(first_name,last_name,city,age);
		p.ShowData();
	}

}
