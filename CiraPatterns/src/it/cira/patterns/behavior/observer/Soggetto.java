package it.cira.patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Soggetto {
	private List<Osservatore> osservatori = new ArrayList<Osservatore>();
	   private int state;

	   public int getState() {
	      return state;
	   }

	   public void setState(int state) {
	      this.state = state;
	      avvisaTuttiGliOsservatori();
	   }

	   public void aggiungi(Osservatore osservatore){
	      osservatori.add(osservatore);		
	   }

	   public void avvisaTuttiGliOsservatori(){
	      for (Osservatore osservatore : osservatori) {
	         osservatore.aggiorna();
	      }
	   } 	
}
