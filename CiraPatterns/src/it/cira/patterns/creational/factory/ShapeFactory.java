
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.creational.factory;

public class ShapeFactory {

	/*
	 * getShape restituisce l'oggetto richiesto
	 */
	public Shape getShape(String shapeType){

		if(shapeType == null){
			return null;
		}		
		if(shapeType.equalsIgnoreCase("CERCHIO")){
			return new Cerchio();

		} else if(shapeType.equalsIgnoreCase("RETTANGOLO")){
			return new Rettangolo();

		} else if(shapeType.equalsIgnoreCase("QUADRATO")){
			return new Quadrato();
		}

		return null;
	}
}