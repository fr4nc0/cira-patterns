
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.creational.factoryMethod;

public class ShapeFactory {

	/*
	 * getShape restituisce l'oggetto richiesto
	 */
	public Shape getShape(String shapeType){

		if(shapeType == null){
			return null;
		}		

		if(shapeType.equalsIgnoreCase("CERCHIO")){

			Cerchio cerchio	= new Cerchio();
			cerchio.setColor("Bianco");
			cerchio.setRadius(6);
			return cerchio;

		} else if(shapeType.equalsIgnoreCase("RETTANGOLO")){

			Rettangolo rettangolo = new Rettangolo();
			rettangolo.setColor("Rosso");
			rettangolo.setEdge1(8);
			rettangolo.setEdge2(6);
			return rettangolo;

		} else if(shapeType.equalsIgnoreCase("QUADRATO")){

			Quadrato quadrato = new Quadrato();
			quadrato.setColor("Verde");
			quadrato.setEdge(4);
			return quadrato;
		}

		return null;
	}
}