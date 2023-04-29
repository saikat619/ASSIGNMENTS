/*Create Employee class with members id(int),name(string),dob(Date).Use above created Date class.
Write default and parameterised constructor in Employee Class.Write accept() function to accept information and display() to display emp information.
*/
import java.util.Scanner;
public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("enter employee ID, name, date of birth <separated with spaces>");
        e.AcceptData(sc.nextInt(), sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        e.display_data();
	}

}
