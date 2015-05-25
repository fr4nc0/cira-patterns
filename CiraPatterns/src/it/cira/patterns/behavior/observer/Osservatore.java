package it.cira.patterns.behavior.observer;

public abstract class Osservatore {

	protected Soggetto soggetto;
	
	public abstract void aggiorna();
}
