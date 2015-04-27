
/**
 * @author: F. Gargiulo
 * 
 */


package it.cira.patterns.structural.bridge;

import java.util.Collection;


public class MatriceCompleta extends Matrice{

	public MatriceCompleta( int righe, int colonne, Collection collection ) {

		super( righe, colonne, collection );
		
		for(int i = 1 ; i <= righe; i++ )
			
			for(int j = 1 ; j <= colonne; j++ )
		
				createPosition( i, j );
	}

	@Override
	public void put( int riga, int colonna, int valore ){

		CellaMatrice cella = getPosition( riga, colonna );
		cella.setValore(valore);
	}

	@Override
	public int get( int riga, int colonna ) {
		
		CellaMatrice cella = getPosition( riga, colonna );
		return cella.getValore();
	}
}
