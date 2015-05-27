package it.cira.patterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Impiegato {
	
	private String nome;
	private String dipartimento;
	private int stipendio;
	private List<Impiegato> sottoposti;

	// constructor
	public Impiegato(String nome,String dipartimento, int stipendio) {
		this.nome = nome;
		this.dipartimento = dipartimento;
		this.stipendio = stipendio;
		sottoposti = new ArrayList<Impiegato>();
	}

	public void add(Impiegato e) {
		sottoposti.add(e);
	}

	public void remove(Impiegato e) {
		sottoposti.remove(e);
	}

	public List<Impiegato> getSottoposti(){
		return sottoposti;
	}

	public String toString(){
		return ("Impiegato :[ nome : " + nome + ", dipartimento : " + dipartimento + ", stipendio :" + stipendio+" ]");
	}   

}
