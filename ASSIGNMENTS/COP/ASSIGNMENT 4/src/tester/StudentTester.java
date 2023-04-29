package tester;

import pkg.Student;
import java.util.Scanner;

public class StudentTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];
		int index = 0;
		int ch;
		do {
			System.out.println("please enter a choice: " + "\n1.enter Student" + "\n2. display Student"
					+ "\n3. Show all Students name with Roll No." + "\n4. exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < 5) {
					System.out.println("enter the name and address of Student separated with spaces:");
					arr[index] = new Student(sc.next(), sc.next());
					System.out.println(arr[index]);
					System.out.println("student added  according to roll no.!!!");
					index++;
				} else
					System.out.println("memory is full");
				break;
			case 2:
				if (index > 0) {
					int roll_no = 0;
					String name = null;
					System.out.println("enter name or roll no of the student");
					if (sc.hasNext()) {
						roll_no = sc.nextInt();
					} 
					else
						name = sc.next();
					boolean flag = false;
					for (int i = 0; i < index; i++) {
						if (name.equals(arr[i].getStu_name()) || roll_no == arr[i].getRoll_no()) {
							flag = true;
							System.out.println(arr[i]);
							break;
						}
					}
					if (flag==false)
						System.out.println("student not found");
				} else
					System.out.println("No student exist in memory");
				break;
			case 3:if (index>0) {
				for(Student s:arr) {
					if (s!=null)
						System.out.println(s.getRoll_no()+s.getStu_name());
				}
			}
				break;
			default:System.out.println("please enter a valid choice");
				break;
			}
		} while (ch != 4);

	}

}
