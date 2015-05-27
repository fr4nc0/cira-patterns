package it.cira.patterns.behavior.state;

public class StatoIniziale implements Stato {

	public String toString(){
		return "Stato iniziale";
	}

	@Override
	public void esegui(Contesto contesto) {

		contesto.setStato(this);

	}
}

