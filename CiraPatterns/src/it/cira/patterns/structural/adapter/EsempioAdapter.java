
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.adapter;

public class EsempioAdapter {

	
	public static void main(String [] args){
		

		/*
		 * NOTA: la  classe PersonaDAO 
		 * 	1. è completamente nascosta e 
		 * 	2. non è stata modificata 
		 */
		
		/*
		 *  PersonaDAO ========> PersonaAdapter
		 */
		System.out.println( " PersonaDAO ========> PersonaAdapter ");
		InterfacciaPersona francescoAdapter = new PersonaAdapter(1, "Francesco", "Gargiulo",
				"via Roma", "08100", "Caserta", "Italia" );
		francescoAdapter.visualizza();
		
		
		/*
		 *  PersonaAdapter ========> PersonaDAO 
		 */
		System.out.println( "\n\nPersonaAdapter ========> PersonaDAO" );
		InterfacciaPersona eleonoraAdapter = new PersonaAdapter();
		eleonoraAdapter.setNominativo("Eleonora Ascione");
		eleonoraAdapter.salva();
		
		
		/*
		 *  PersonaAdapter ========> InterfacciaPersona 
		 */
		System.out.println( "\n\nPersonaAdapter ========> InterfacciaPersona" );
		InterfacciaPersona persona = francescoAdapter;
		System.out.println( " \tvisualizza i dati nell'oggetto InterfacciaPersona...");
		System.out.println( "\t" + persona.getNominativo() );
		System.out.println( "\t" + persona.getIndirizzoCompleto() );
		
		
		/*
		 *  InterfacciaPersona ========> PersonaAdapter ========> PersonaDAO
		 */
		System.out.println( "\n\nInterfacciaPersona ========> PersonaAdapter ========> PersonaDAO" );
		persona.setNominativo("Pasqua Laviola");
		persona.salva();
		
		
		/*
		 *  PersonaDAO ========> PersonaAdapter ========> InterfacciaPersona 
		 */
		System.out.println( "\n\nPersonaDAO ========> PersonaAdapter ========> InterfacciaPersona" );
		InterfacciaPersona nunzia	 = new PersonaAdapter();
		nunzia.leggi(1);
		nunzia.visualizza();
		
	}
}
