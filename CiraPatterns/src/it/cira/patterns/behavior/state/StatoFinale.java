package it.cira.patterns.behavior.state;

public class StatoFinale implements Stato {

	public String toString(){
		return "Stato finale";
	}

	@Override
	public void esegui(Contesto contesto) {
		contesto.setStato(this);

	}
}
