
/**
 * @author: F. Gargiulo
 * 
 */

package it.cira.patterns.structural.adapter;

public interface InterfacciaPersona {

	
	/*
	 * getter e setter con lo stesso nome
	 */
	public abstract Integer getId();

	public abstract void setId(Integer id);

	
	
	/*
	 * getters e setter "adattati"
	 */
	public abstract String getNominativo();

	public abstract void setNominativo(String nome);

	public abstract String getIndirizzoCompleto();

	public abstract void setIndirizzoCompleto(String indirizzo);

	
	
	/*
	 * metodi di PersonaDAO
	 */
	
	public abstract void salva();
	
	public abstract void visualizza();
	
	public abstract void leggi(Integer id);
		
}
