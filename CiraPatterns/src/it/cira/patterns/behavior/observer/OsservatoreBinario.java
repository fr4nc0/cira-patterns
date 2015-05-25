package it.cira.patterns.behavior.observer;

public class OsservatoreBinario extends Osservatore {

	public OsservatoreBinario(Soggetto soggetto){
		this.soggetto = soggetto;
		this.soggetto.aggiungi(this);
	}

	@Override
	public void aggiorna() {
		System.out.println( "Binary String: " + Integer.toBinaryString( soggetto.getState() ) ); 
	}
}
