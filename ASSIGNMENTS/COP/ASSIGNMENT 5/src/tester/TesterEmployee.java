package tester;

import java.util.Scanner;
import com.app.org.*;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of employee database");
		int size = sc.nextInt();
		Employee[] arr = new Employee[size];
		int index = 0, ch;
		do {
			System.out.println("Enter a choice:1. Hire Manager\r\n" + "2. Hire Worker\n"
					+ "3.Display information of all employees\n" + "4.Update basic salary");
			ch = sc.nextInt();
			switch (ch) {
			case 1:// Hiring manager
				if (index < size) {
					System.out.println("enter the firstname and the last name of the employee");
					String firstname = sc.next();
					String lastname = sc.next();
					System.out.println("enter the department id and basic salary and performance bonus");
					int id = sc.nextInt();
					double salary = sc.nextDouble();
					double perfbonus = sc.nextDouble();
					arr[index] = new Manager(firstname, lastname, id, salary, perfbonus);
					index++;
					System.out.println("Employee added successfully!!");
				} else
					System.out.println("Database is full!!!");
				break;

			case 2:// Hiring worker
				if (index < size) {
					System.out.println("enter the firstname and the last name of the employee");
					String firstname = sc.next();
					String lastname = sc.next();
					System.out.println("enter the department id and basic salary and hourlyrate");
					int id = sc.nextInt();
					double salary = sc.nextDouble();
					double hourlyrate = sc.nextDouble();
					arr[index] = new Worker(firstname, lastname, id, salary, hourlyrate);
					System.out.println("Employee added succesfully!!");
					index++;
				} else
					System.out.println("Database is full!!!");
				break;

			case 3:// Displaying all employee details
				System.out.println("Employee details:...............\n\n");
				for (Employee e : arr) {
					if (e != null) {
						if (e instanceof Worker) {
							System.out.println("Enter the working hours of the worker to calculate the salary:");
							((Worker) e).setWorking_hours(sc.nextInt());
							System.out.println(e);
						} else
							System.out.println(e);
					}
				}
				break;

			case 4:// Updating salary of Employee
				System.out.println("Please enter the Employee ID:\n");
				int id = sc.nextInt();
				System.out.println("Enter the amount to increment in basic salary:");
				double increment = sc.nextDouble();;
				for (int i = 0; i < index; i++) {
					if (id == arr[i].getId()) {
						id = i;
						System.out.println("Employee details \n" + arr[id]);
						break;
					}
				}
				try {
					arr[id].updateBasic(increment);
					System.out.println("Salary Updated Successfully");
					System.out.println(arr[id]);
				} catch (NullPointerException n) {
					System.out.println("\nError!!! The ID entered cannot be found in database");
				}
				break;

			default:
				System.out.println("please enter a valid choice!!!");
				break;

			}

		} while (ch != 0);

	}

}
