package it.cira.patterns.creational.builder2;

public abstract class Bibita implements Item{


	@Override
	public Contenitore contenitore() {
		return new Bottiglia();
	}

	@Override
	public abstract float prezzo();


}
