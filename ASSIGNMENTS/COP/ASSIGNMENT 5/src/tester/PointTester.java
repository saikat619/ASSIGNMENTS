package tester;

import java.util.Scanner;
import com.cdac.geometry.Point2D;

public class PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of point you want to plot");
		int size = sc.nextInt();
		Point2D[] arr = new Point2D[size];
		int ch = 0, index = 0;
		do {
			System.out.println("please enter a choice " + "\n1.enter the points" + "\n2.display all points"
					+ "\n3.enter the index of points to check the equality"+"\n0.Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (index < size) {
					System.out.println("please enter the X and Y coordinate of the point");
					arr[index] = new Point2D(sc.nextDouble(), sc.nextDouble());
					index++;
				} else
					System.out.println("array is full");
				break;
			case 2:
				for (Point2D p : arr) {
					if (p != null)
						System.out.println(p);
				}
				break;
			case 3:
				System.out.println("enter the index of two points");
				int i =sc.nextInt();
				int i1 =sc.nextInt();
				boolean flag = arr[i-1].isEqual(arr[i1-1]);
				System.out.println(flag);
				if (flag==true)
					System.out.println("points are equal");
				else
					System.out.println(arr[i-1].calculateDistance(arr[i1-1]));
			default:
				break;
			}
		} while (ch != 0);

	}

}
