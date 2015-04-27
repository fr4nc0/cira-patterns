
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.bridge;

import java.util.Collection;

public class MatriceSparsa extends Matrice{

	public MatriceSparsa( int rows, int cols, Collection collection ) {
		super( rows, cols, collection );

	}

	@Override
	public void put( int riga, int colonna, int valore ) {
		
		CellaMatrice cella = getPosition( riga, colonna );
		
		if( cella != null )
			if( valore == 0 ) {
				
				deletePosition( cella );
			
			} else {
				
				cella.setValore(valore); 
			}
		else
			if( valore != 0 ) {
				cella = createPosition( riga, colonna );
				cella.setValore(valore); 
			}
	}

	@Override
	public int get( int riga, int col ) {
		
		CellaMatrice cella = getPosition( riga, col );
		
		if( cella == null)
			return 0;
		else
			return cella.getValore();
	}

}
