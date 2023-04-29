package com.app.fruits;

public class Orange extends Fruit{
	private String taste;
	public Orange() {
		super("Orange","orange",65,true);
		this.taste="sour";
	}
	public Orange(double weight,boolean fresh) {
		super("Orange","orange",weight,fresh);
		this.taste="sour";
	}
	public String Taste() {
		return taste;
	}
	public void juice() {
		System.out.println("name:"+super.getName()+ "weight:"+super.getWeight()+"extracting juice!");
		}

}
