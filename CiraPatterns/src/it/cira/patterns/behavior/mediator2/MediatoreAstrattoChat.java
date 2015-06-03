package it.cira.patterns.behavior.mediator2;

public interface MediatoreAstrattoChat {

	public void inviaMessaggio(String messaggio, UtenteAstratto utenteAstratto);

	void aggiungiUtente(UtenteAstratto utenteAstratto);
}
