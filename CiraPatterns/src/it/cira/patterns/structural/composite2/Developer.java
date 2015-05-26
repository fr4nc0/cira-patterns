package it.cira.patterns.structural.composite2;

/**
 * In this class,there are many methods which are not applicable to developer because
 * it is a leaf node.
 */

public class Developer implements Impiegato{

	private String nome;
	private double stipendio;

	public Developer(String nome,double stipendio){
		this.nome = nome;
		this.stipendio = stipendio;
	}
	public void add(Impiegato impiegato) {
		//this is leaf node so this method is not applicable to this class.
	}

	public Impiegato getChild(int i) {
		//this is leaf node so this method is not applicable to this class.
		return null;
	}

	public String getNome() {
		return nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Name = " + getNome());
		System.out.println("Salary = " + getStipendio());
		System.out.println("-------------");
	}

	public void remove(Impiegato impiegato) {
		//this is leaf node so this method is not applicable to this class.
	}

}
