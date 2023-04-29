package com.app.fruits;

public class Mango extends Fruit  {
	private String taste;
	public Mango() {
		super("Mango","Yellow",70,true);
		this.taste="sweet";
	}
	public Mango(double weight,boolean fresh) {
		super("Mango","Yellow",weight,fresh);
		this.taste="sweet";	
	}
	public String Taste() {
		return taste;
	}
	public void pulp() {
		 System.out.println("name:"+super.getName()+" color:"+super.getColor()+ "creating  pulp!");
		 		}
	
	

}
