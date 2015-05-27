package it.cira.patterns.structural.proxy;

public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      Immagine immagine = new ImmagineProxy("test_10mb.jpg");

      //l'immagine sar� caricata dal disco
      immagine.visualizza(); 
      System.out.println("");
      
      //l'immagine NON sar� caricata dal disco
      immagine.visualizza(); 	
   }
}