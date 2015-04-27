/**
 * @author: F. Gargiulo
 * 
 */


package it.cira.patterns.structural.adapter;

public class PersonaDAO {

	Integer 	id;
	String		nome;
	String		cognome;
	String		indirizzo;
	String 		CAP;
	String		citta;
	String		paese;
	
	
	/*
	 * costruttori
	 */
	public PersonaDAO() {
		
	}
	
	public PersonaDAO(Integer id, String nome, String cognome,
			String indirizzo, String cAP, String citta, String paese) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		CAP = cAP;
		this.citta = citta;
		this.paese = paese;
	}
	
	
	
	/*
	 * getters e setter
	 */
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getCAP() {
		return CAP;
	}
	
	public void setCAP(String cAP) {
		CAP = cAP;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public String getPaese() {
		return paese;
	}
	
	public void setPaese(String paese) {
		this.paese = paese;
	}
	
	
	
	/*
	 * metodi
	 */
	public void leggiDAO(Integer id) {
		
		System.out.println( " \tlettura in PersonaDAO... " );
		this.id 		= 1;
		this.nome		= "Nunzia";
		this.cognome	= "Sole";
		this.CAP		= "08100";
		this.indirizzo	= "parco della Vittoria";
		this.paese		= "Italia";
		this.citta		= "Monopoli";
	
	}
	
	public void salvaDAO() {
		
		System.out.println( " \tscrittura in PersonaDAO dei dati passati da PersonaAdapter..." );
		System.out.println( "\t" + nome);
		System.out.println( "\t" + cognome);
	
	}
	
	public void visualizzaDAO() {
		
		System.out.println( " \tvisualizzazione in PersonaDAO..." );
		System.out.println( "\t" + nome);
		System.out.println( "\t" + cognome);
		System.out.println( "\t" + indirizzo);
		
	}
	
}
