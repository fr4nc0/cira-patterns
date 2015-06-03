package it.cira.patterns.behavior.mediator2;

public class Mediator2PatternDemo {

	public static void main(String[] args) {

		MediatoreAstrattoChat mediatore = new MediatoreChat();

		UtenteAstratto io 	= new Utente(mediatore, "Io");
		UtenteAstratto tu 	= new Utente(mediatore, "Tu");
		UtenteAstratto lui	= new Utente(mediatore, "Lui");
		UtenteAstratto lei 	= new Utente(mediatore, "Lei");

		/*
		 * nel caso gli utenti non siano stati aggiunti direttamente nel costruttore
		 */ 
		mediatore.aggiungiUtente(io);
		mediatore.aggiungiUtente(tu);
		mediatore.aggiungiUtente(lui);
		mediatore.aggiungiUtente(lei);
		
		io.invia("ciao, ti ricordi di me?");
	}
}
