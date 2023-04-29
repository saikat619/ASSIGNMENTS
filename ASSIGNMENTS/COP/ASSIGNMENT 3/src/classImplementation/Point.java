package classImplementation;
public class Point {
private int x,y;
public Point() {
	System.out.println("point has been created at (0,0)"+
						"you can set the values as per the choice");
}
public Point(int x ,int y) {
	this.x=x;
	this.y=y;
}
public void SetX(int a) {x=a;}
public void SetY(int b) {y=b;}
public int Getx() {return x;}
public int GetY() {return y;}
public void DisplayPoint() {
	System.out.println("X = "+x+"Y = "+y);	
}
}
