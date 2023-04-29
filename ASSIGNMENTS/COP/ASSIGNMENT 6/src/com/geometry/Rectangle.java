package com.geometry;

public class Rectangle extends Shape {
private double len;
private double wid;
public Rectangle() {
	super();
	this.len = 0;
	this.wid = 0;
}
public Rectangle(double len, double wid) {
	super();
	this.len = len;
	this.wid = wid;
}

public double getLen() {
	return len;
}

public void setLen(double len) {
	this.len = len;
}

public double getWid() {
	return wid;
}

public void setWid(double wid) {
	this.wid = wid;
}

@Override
public double area() {
	return (len*wid);
}
@Override
public String toString() {
	return "Rectangle [len=" + len + ", wid=" + wid + "]";
}
@Override
public void print() {
System.out.println("you are in rectangle");	
}
@Override
public boolean isEquals(Object obj) {
	Rectangle r = (Rectangle)obj;
	if (this.len==r.len && this.wid==r.wid)
		return true;
	else
	return false;
}


}
