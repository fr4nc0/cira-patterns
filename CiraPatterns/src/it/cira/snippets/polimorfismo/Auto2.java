package it.cira.snippets.polimorfismo;

public class Auto2 implements InterfaceVeicolo {

	@Override
	public void frena() {
		System.out.println("auto frena");
		
	}

	@Override
	public void accelera() {
		System.out.println("auto accelera");
		
	}

	
}
