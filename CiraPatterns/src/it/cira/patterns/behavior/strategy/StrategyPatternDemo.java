package it.cira.patterns.behavior.strategy;

public class StrategyPatternDemo {
	
	public static void main(String[] args) {

		Contesto contesto = new Contesto(new Addizione());		
		System.out.println("10 + 5 = " + contesto.eseguiStrategia(10, 5));

		contesto = new Contesto(new Sottrazione());		
		System.out.println("10 - 5 = " + contesto.eseguiStrategia(10, 5));

		contesto = new Contesto(new Moltiplicazione());		
		System.out.println("10 * 5 = " + contesto.eseguiStrategia(10, 5));
	}
}

