package it.cira.patterns.creational.builder2;

public class HamburgerDiPollo extends Hamburger {

	@Override
	public String nome() {
		return "Hamburger di pollo";
	}

	@Override
	public float prezzo() {
		return 3.5f;
	}
	
}
