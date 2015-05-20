package it.cira.patterns.creational.factoryMethod2;

import it.cira.patterns.creational.factoryMethod.Shape;

public class Cerchio2 implements Shape {

	private String color;
	private int 	radius;
	
	private Cerchio2() {
		
	}

	
	public static Shape createNew() {
		Cerchio2 cerchio = new Cerchio2();
		return cerchio;
	}
	
	
	@Override
	public void draw() {
		System.out.println("Disegna un cerchio di colore " + color + " di raggio " + radius);
	}
	
	@Override
	public void setColor(String color) {
		this.color = color;
		
	}

	@Override
	public String getColor() {
		return this.color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}



	

}
