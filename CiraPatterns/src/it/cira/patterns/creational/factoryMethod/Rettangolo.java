
/**
 * @author: F. Gargiulo
 * 
 */


package it.cira.patterns.creational.factoryMethod;

public class Rettangolo implements Shape {

	private String 	color;
	private int 	edge1;
	private int 	edge2;
	
	@Override
	public void draw() {
		System.out.println("Disegna un rettangolo di colore " + color + " con i lati " + edge1 + " e " + this.edge2);
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	public int getEdge1() {
		return this.edge1;
	}

	public void setEdge1(int edge1) {
		this.edge1 = edge1;
	}

	public int getEdge2() {
		return this.edge2;
	}

	public void setEdge2(int edge2) {
		this.edge2 = edge2;
	}
	
	
}
