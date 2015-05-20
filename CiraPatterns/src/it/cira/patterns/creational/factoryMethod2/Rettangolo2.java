package it.cira.patterns.creational.factoryMethod2;

import it.cira.patterns.creational.factoryMethod.Rettangolo;
import it.cira.patterns.creational.factoryMethod.Shape;

public class Rettangolo2 extends Rettangolo{
	
	private Rettangolo2() {

	}

	public static Shape createNew() {
		Rettangolo2 rettangolo = new Rettangolo2();
		return rettangolo;
	}
}
