package it.cira.patterns.creational.builder2;

public abstract class Hamburger implements Item {

	@Override
	public Contenitore contenitore() {
		return new Confezione();
	}

	@Override
	public abstract float prezzo();

}
