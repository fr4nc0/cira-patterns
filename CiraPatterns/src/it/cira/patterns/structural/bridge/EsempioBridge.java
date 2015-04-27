
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class EsempioBridge {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		final int ROWS = 3;
		final int COLS = 4;

		MatriceCompleta completaVect = new MatriceCompleta( ROWS, COLS, new Vector() );

		System.out.println( "Matrice completa con  Vector:");
		aggiungiValori(completaVect);
		display(completaVect);


		MatriceSparsa sparsaVect = new MatriceSparsa( ROWS, COLS, new Vector() );
		System.out.println( "\nMatrice sparsa con Vector:");
		aggiungiValori(sparsaVect);
		display(sparsaVect);


		MatriceCompleta completaArray = new MatriceCompleta( ROWS, COLS, new ArrayList() );
		System.out.println( "\nMatrice completa con ArrayList:");
		aggiungiValori(completaArray);
		display(completaArray);

		
		MatriceSparsa sparsaArray = new MatriceSparsa( ROWS, COLS, new ArrayList() );
		System.out.println( "\nMatrice sparsa con ArrayList:");
		aggiungiValori(sparsaArray);
		display(sparsaArray);
	}



	private static void aggiungiValori(Matrice matrice) {

		matrice.put( 1, 2, 1 );
		matrice.put( 2, 1, 2 );
		matrice.put( 3, 3, 3 );
		matrice.put( 1, 2, 0 );
		
	}



	private static void display(Matrice matrice) {

		//System.out.println("\n");

		for ( int i = 1;  i <= matrice.getRighe(); i++ ){
			
			for ( int j = 1;  j <= matrice.getColonne(); j++ ){

				System.out.print( matrice.get( i, j ) + " " );
				
			}
			
			System.out.println();
		}

	}

}
