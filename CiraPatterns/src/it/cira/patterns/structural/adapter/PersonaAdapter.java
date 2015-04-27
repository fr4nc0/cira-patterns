
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.adapter;

public class PersonaAdapter extends PersonaDAO implements InterfacciaPersona   {

	
	/*
	 * costruttori
	 */
	
	public PersonaAdapter() {
		
	}
	
	public PersonaAdapter(Integer id, String nome, String cognome, String indirizzo,
			String cAP, String citta, String paese) {
		
		super(id, nome, cognome, indirizzo, cAP, citta, paese);
		
	}

	
	
	
	/*
	 * getters e setters
	 */
	
	@Override
	public String getNominativo() {
		
		return getNome() + " " + getCognome();
	}

	@Override
	public void setNominativo(String nominativo) {
		
		String[] tokens = nominativo.split(" ");
		setNome(tokens[0]);
		setCognome(tokens[1]);
	}

	@Override
	public String getIndirizzoCompleto() {
		
		return getIndirizzo() + " - " + getCAP() + " " + getCitta() + ", " + getPaese();
	}

	@Override
	public void setIndirizzoCompleto(String indirizzo) {
		
		/*
		 * Da implementare
		 */
	}
	
	
	
	/*
	 * metodi
	 */
	
	@Override
	public void visualizza() {
		
		System.out.println( " \tvisualizza in PersonaAdapter..." );
		System.out.println( "\t" + getNominativo() );
		System.out.println( "\t" + getIndirizzoCompleto() );
		
	}
	
	@Override
	public void salva() {
		
		salvaDAO();
		
	}

	@Override
	public void leggi(Integer id) {
		leggiDAO(id);
		
	}
	
}
