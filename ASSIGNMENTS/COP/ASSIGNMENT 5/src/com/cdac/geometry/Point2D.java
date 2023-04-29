package com.cdac.geometry;
import java.lang.Math;
public class Point2D {
private double x,y;
public Point2D() {
	x=0.0;
	y=0.0;
	System.out.println("point ahs been created at origin!!"
			+ " \n you can set x and y coordinate using setX and setY");
}
public Point2D(double x , double y) {
	this.x=x;
	this.y=y;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public String toString() {
	return "X = "+x+" "+"Y = "+y;
}
public boolean isEqual(Point2D p) {
	if (this.x==p.x && this.y==p.y) {
		return true;
	}
	else
		return false;
}
public double calculateDistance(Point2D p) {
	double rel_x=Math.abs(this.x-p.x);
	double rel_y=Math.abs(this.y-p.y);
	double distance = Math.sqrt((Math.pow(rel_x, 2))+(Math.pow(rel_y, 2)));
	return distance;
}
}
