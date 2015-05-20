package it.cira.patterns.creational.builder2;

public class HamburgerVegetale extends Hamburger {

	@Override
	public String nome() {
		return "Hamburger vegetale";
	}

	@Override
	public float prezzo() {
		return 2.5f;
	}
	
}
