package it.cira.patterns.behavior.interpreter;

public class EspressioneAND implements Espressione {

	private Espressione expr1 = null;
	private Espressione expr2 = null;

	public EspressioneAND(Espressione expr1, Espressione expr2) { 
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpreta(String contesto) {		
		return expr1.interpreta(contesto) && expr2.interpreta(contesto);
	}
}
