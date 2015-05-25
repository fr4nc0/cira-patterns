package it.cira.patterns.behavior.observer;

public class OsservartoreOttale extends Osservatore {

	public OsservartoreOttale(Soggetto soggetto){
		this.soggetto = soggetto;
		this.soggetto.aggiungi(this);
	}

	@Override
	public void aggiorna() {
		System.out.println( "Octal String: " + Integer.toOctalString( soggetto.getState() ) ); 
	}
}

