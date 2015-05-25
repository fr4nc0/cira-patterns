package it.cira.patterns.behavior.strategy;

public class Moltiplicazione implements Strategia {

	@Override
	public int eseguiOperazione(int num1, int num2) {
		return num1 * num2;
	}

}
