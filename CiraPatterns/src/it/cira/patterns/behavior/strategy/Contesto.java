package it.cira.patterns.behavior.strategy;

public class Contesto {

	private Strategia strategia;

	public Contesto(Strategia strategia){
		this.strategia = strategia;
	}

	public int eseguiStrategia(int num1, int num2){
		return strategia.eseguiOperazione(num1, num2);
	}
}
