
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.bridge;

public class CellaMatrice {
	
	private int riga, colonna, valore;
	
	public CellaMatrice( int r, int c ) {
		riga = r;
		colonna = c;
		valore = 0;
	}

	public int getRiga() {
		return riga;
	}

	public void setRiga(int riga) {
		this.riga = riga;
	}

	public int getColonna() {
		return colonna;
	}

	public void setColonna(int colonna) {
		this.colonna = colonna;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	
	
	
}