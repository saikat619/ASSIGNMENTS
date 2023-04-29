package Tester;

import com.geometry.*;
import java.util.Scanner;

public class ShapeTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape[] arr = new Shape[5];
		for (Shape s : arr) {
			s = ShapeFactory.generateShape();
		}
		for (Shape s : arr) {
			if (s != null) {
				if (s instanceof Circle) {
					System.out.println("enter radius of circle");
					((Circle) s).setR(sc.nextDouble());
					System.out.println(s.area());
				}
				if (s instanceof Rectangle) {
					System.out.println("enter lenghth and width of rectangle");
					((Rectangle) s).setLen(sc.nextDouble());
					((Rectangle) s).setWid(sc.nextDouble());
					System.out.println(s.area());
				}
				if (s instanceof Square) {
					System.out.println("enter Side of the square");
					((Square) s).setSide(sc.nextDouble());
					System.out.println(s.area());
				}
			}
		}

	}
}
