
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.creational.factoryMethod;

public class Quadrato implements Shape {

	private String 	color;
	private int 	edge;
	
	@Override
	public void draw() {
		System.out.println("Disegna un quadrato di colore " + color + " di lato " + edge);
	}
	
	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}
}
