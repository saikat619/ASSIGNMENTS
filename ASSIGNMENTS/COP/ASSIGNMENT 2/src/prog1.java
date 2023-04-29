/*1:Create Date class with members day,month ,year.
Write no argument and parameterized constructor .Create two object s and initialize them using no argument and parameterised constructor
respectively.Print date using display function.*/
import java.util.Scanner;
public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date d= new Date();
		System.out.println("the date is");
		d.show_date();
		Date d1= new Date();
		System.out.println("enter the date in dd-mm-yyyy format:");
		d1.Data(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("the date is");
		d1.show_date();
		

	}

}
