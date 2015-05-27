package it.cira.snippets.creazioneSenzaFactory;

import java.util.ArrayList;
import java.util.List;

import it.cira.patterns.creational.factoryMethod.Cerchio;
import it.cira.patterns.creational.factoryMethod.Quadrato;
import it.cira.patterns.creational.factoryMethod.Rettangolo;
import it.cira.patterns.creational.factoryMethod.Shape;

public class CreazioneSenzaFactory {
	
	  public static void main(String[] args) {
		  
		  Cerchio cerchio = new Cerchio();
		  cerchio.setColor("Bianco");
		  cerchio.setRadius(6);
		  
		  Rettangolo rettangolo = new Rettangolo();
		  rettangolo.setColor("Rosso");
		  rettangolo.setEdge1(8);
		  rettangolo.setEdge2(6);
		  
		  Quadrato	quadrato = new Quadrato();
		  quadrato.setColor("Verde");
		  quadrato.setEdge(4);
		  
		  List<Shape> list = new ArrayList<Shape>();
		  list.add(cerchio);
		  list.add(rettangolo);
		  list.add(quadrato);
		  	
		  disegnaImmagine(list);   
	  }
	  
	  private static void disegnaImmagine(List<Shape> list) {
		  
		  for ( Shape shape: list ) {
			  shape.draw();
		  }
	  }

}
