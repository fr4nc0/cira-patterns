package it.cira.patterns.structural.composite2;

public interface Impiegato {

	public void add(Impiegato impiegato);
	public void remove(Impiegato impiegato);
	public Impiegato getChild(int i);
	public String getNome();
	public double getStipendio();
	public void print();
}