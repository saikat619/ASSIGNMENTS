package com.geometry;

public class Circle extends Shape {
	
	private double r;
	private static final double pi =3.14;
	public Circle(double r) {
		super();
		this.r = r;
	}

	public Circle() {
		this.r=0;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return(pi*r*r);
	}

	@Override
	public String toString() {
		return "Circle with radius "+r;
	}

	@Override
	public void print() {
		System.out.println("you are in circle");
		
	}

	@Override
	public boolean isEquals(Object obj) {
		Circle c = (Circle)obj;
		if (this.r==c.r)
			return true;
		else
		return false;
	}
	


}
