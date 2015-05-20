
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.creational.factoryMethod;

public class Cerchio implements Shape {

	private String 	color;
	private int 	radius;
	
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

