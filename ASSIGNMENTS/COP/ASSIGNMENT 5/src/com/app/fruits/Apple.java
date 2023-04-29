package com.app.fruits;

public class Apple extends Fruit {
private String taste;
public Apple() {
	super("apple","red",60,true);
	this.taste="Sweet and Sour";
}
public Apple(double weight,boolean fresh) {
	super("Apple","Red",weight,fresh);
}
public String Taste() {
	return  taste;
}
public void jam() {
	 System.out.println("Display name of the fruit + a mesg  making jam!");
		}
}
