package it.cira.patterns.behavior.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		Contesto contesto = new Contesto();

		Stato inizio0 = new StatoIniziale();
		inizio0.esegui(contesto);
		System.out.println(contesto.getStato().toString());
		
		StatoIniziale inizio = new StatoIniziale();
		inizio.esegui(contesto);
		System.out.println(contesto.getStato().toString());

		StatoFinale fine = new StatoFinale();
		fine.esegui(contesto);
		System.out.println(contesto.getStato().toString());

	}
}
