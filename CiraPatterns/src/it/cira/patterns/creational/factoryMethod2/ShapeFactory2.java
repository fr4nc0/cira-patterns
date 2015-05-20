package it.cira.patterns.creational.factoryMethod2;

import it.cira.patterns.creational.factoryMethod.Shape;

public interface ShapeFactory2 {

	public Shape getShape(String shapeType);
}
