package com.geometry;
import java.util.Scanner;
import java.util.Random;

public class ShapeFactory {
	static Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public static Shape generateShape() {
		Random rand = new Random();
		int upperbound = 3;
		int rand_no = rand.nextInt(upperbound);
		//System.out.println(rand_no);
		if (rand_no == 0) {
			System.out.println("Circle has been created");
			Circle c = new Circle();
			return c;
		} else if (rand_no == 1) {
			System.out.println("Rectangle has been created");
			Rectangle r = new Rectangle();
			return r;
		} else {
			System.out.println("Square has been created");
			Square s = new Square();
			return s;
		}

	}
}
