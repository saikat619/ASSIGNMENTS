package com.app.fruits;

public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean fresh;
	public Fruit() {
		this.color="No color";
		this.weight=50;
		this.name="Fruit";
		this.fresh=true;
	}
	public Fruit(String name,String color,double weight,boolean fresh) {
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.fresh=fresh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public String Taste() {
		return "no taste as such";
	}
	public String toString() {
		return "name:"+name+"\ncolor:"+color+"weight:"+weight;
	}
	

}
