package it.cira.patterns.behavior.observer;

public class OsservatoreEsadecimale extends Osservatore {

	public OsservatoreEsadecimale(Soggetto soggetto){
		this.soggetto = soggetto;
		this.soggetto.aggiungi(this);
	}

	@Override
	public void aggiorna() {
		System.out.println( "Hex String: " + Integer.toHexString( soggetto.getState() ).toUpperCase() ); 
	}
}
