package it.cira.patterns.behavior.observer;

public class ObserverPatternDemo {
	   public static void main(String[] args) {
	      Soggetto soggetto = new Soggetto();

	      new OsservatoreEsadecimale(soggetto);
	      new OsservartoreOttale(soggetto);
	      new OsservatoreBinario(soggetto);

	      System.out.println("First state change: 15");	
	      soggetto.setState(15);
	      System.out.println("Second state change: 10");	
	      soggetto.setState(10);
	   }
	}
