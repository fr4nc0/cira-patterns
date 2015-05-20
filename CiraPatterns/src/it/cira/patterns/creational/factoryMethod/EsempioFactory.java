package it.cira.patterns.creational.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class EsempioFactory {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		/*
		 * richiede gli oggetti 
		 */
		Shape cerchio 		= shapeFactory.getShape("CERCHIO");
		Shape rettangolo 	= shapeFactory.getShape("RETTANGOLO");
		Shape quadrato 		= shapeFactory.getShape("QUADRATO");

		List<Shape> list = new ArrayList<Shape>();
		list.add(cerchio);
		list.add(rettangolo);
		list.add(quadrato);

		disegnaImmagine(list);
	}

	private static void disegnaImmagine(List<Shape> list) {

		for ( Shape shape: list ) {
			shape.draw();
		}
	}
}