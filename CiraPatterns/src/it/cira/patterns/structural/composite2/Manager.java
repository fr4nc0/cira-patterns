package it.cira.patterns.structural.composite2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Impiegato{

	private String nome;
	private double stipendio;

	public Manager(String nome,double stipendio){
		this.nome = nome;
		this.stipendio = stipendio;
	}

	List<Impiegato> impiegati = new ArrayList<Impiegato>();

	public void add(Impiegato employee) {
		impiegati.add(employee);
	}

	public Impiegato getChild(int i) {
		return impiegati.get(i);
	}

	public String getNome() {
		return nome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Nome = " + getNome());
		System.out.println("Salary = " + getStipendio());
		System.out.println("-------------");

		Iterator<Impiegato> employeeIterator = impiegati.iterator();
		
		while(employeeIterator.hasNext()){
			Impiegato employee = employeeIterator.next();
			employee.print();
		}
	}

	public void remove(Impiegato employee) {
		impiegati.remove(employee);
	}

}
