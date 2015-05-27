package it.cira.patterns.creational.factoryMethod2;

import it.cira.patterns.creational.factoryMethod.Shape;
import it.cira.patterns.creational.factoryMethod.ShapeFactory;

import java.util.ArrayList;
import java.util.List;

public class EsempioFactory2 {

	public static void main(String[] args) {

		ShapeFactory2 shapeFactory2 = new ConcreteShapeFactory();

		/*
		 * richiede gli oggetti 
		 */
		Shape cerchio 		= shapeFactory2.getShape("CERCHIO");
		Shape rettangolo 	= shapeFactory2.getShape("RETTANGOLO");
		Shape quadrato 		= shapeFactory2.getShape("QUADRATO");

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
