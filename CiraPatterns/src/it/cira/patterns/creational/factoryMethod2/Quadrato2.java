package it.cira.patterns.creational.factoryMethod2;

import it.cira.patterns.creational.factoryMethod.Quadrato;
import it.cira.patterns.creational.factoryMethod.Shape;

public class Quadrato2 extends Quadrato {

	private Quadrato2() {

	}
	public static Shape createNew() {
		Quadrato2 quadrato = new Quadrato2();
		return quadrato;
	}
}
