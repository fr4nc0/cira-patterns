package it.cira.snippets.mediator;

public interface InterfacciaMediatore {

	public void inviaMessaggio(String messaggio, CollegaAstratto utenteAstratto);

	void aggiungiUtente(CollegaAstratto utenteAstratto);
}
