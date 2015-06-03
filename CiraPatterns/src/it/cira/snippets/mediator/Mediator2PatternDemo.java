package it.cira.snippets.mediator;

public class Mediator2PatternDemo {

	public static void main(String[] args) {

		InterfacciaMediatore mediatore = new Mediatore();

		CollegaAstratto io 	= new Collega(mediatore, "Io");
		CollegaAstratto tu 	= new Collega(mediatore, "Tu");
		CollegaAstratto lui	= new Collega(mediatore, "Lui");
		CollegaAstratto lei 	= new Collega(mediatore, "Lei");

		mediatore.aggiungiUtente(io);
		mediatore.aggiungiUtente(tu);
		mediatore.aggiungiUtente(lui);
		mediatore.aggiungiUtente(lei);

		io.invia("ciao...");
	}
}
