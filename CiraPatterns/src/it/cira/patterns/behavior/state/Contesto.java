package it.cira.patterns.behavior.state;

public class Contesto {

	private Stato stato;

	public Contesto(){
		stato = null;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}


}
