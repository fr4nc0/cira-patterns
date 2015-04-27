
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.bridge;

import java.util.Collection;
import java.util.Iterator;


public abstract class Matrice {

	private int 				righe;
	private int 				colonne;
	private Collection			dati;


	public Matrice(int righe, int colonne, Collection dati) {

		this.righe = righe;
		this.colonne = colonne;
		this.dati = dati;
	}


	/*
	 * interfaccia che devono implementare le matrici
	 */
	public abstract void put( int row, int col, int value );

	public abstract int get( int row, int col );



	/*
	 * operazioni di base sulla matrice
	 */
	protected CellaMatrice getPosition( int riga, int colonna )
	{
		if( (riga > 0 && riga <= this.righe) && ( colonna > 0 && colonna <= this.colonne)  ) {

			Iterator it = dati.iterator();
			while( it.hasNext() ) {
				CellaMatrice cella = (CellaMatrice) it.next();
				if( cella.getRiga() == riga && cella.getColonna() == colonna )
					return cella;
			}
		}


		return null;
	}

	protected CellaMatrice createPosition( int riga, int colonna ) {

		CellaMatrice cella = getPosition( riga, colonna );
		if( cella == null ) {
			cella = new CellaMatrice( riga, colonna );
		}
			
		dati.add( cella );

		return cella;
	}

	protected void deletePosition( CellaMatrice toDelete ) {
		dati.remove( toDelete );
	}




	/*
	 * getters e setters
	 */
	public int getRighe() {
		return righe;
	}

	public void setRighe(int righe) {
		this.righe = righe;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public Collection getDati() {
		return dati;
	}

	public void setDati(Collection dati) {
		this.dati = dati;
	}

}
