package com.geometry;

public class Square extends Shape {
	private double side;
	public Square() {
		this.side=0;
	}
	
	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	@Override
	public double area() {
		return (side *side);
	}

	public void print() {
		System.out.println("you are in square");
	}

	@Override
	public boolean isEquals(Object obj) {
		Square s = (Square)obj;
		if (this.side==s.side)
			return true;
		else
		return false;
	}
	
	

}
