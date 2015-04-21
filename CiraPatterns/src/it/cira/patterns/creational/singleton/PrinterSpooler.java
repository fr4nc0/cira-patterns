package it.cira.patterns.creational.singleton;

public class PrinterSpooler {

	private static PrinterSpooler instance;
	
	/**
	 * Costruttore privato
	 */
	private PrinterSpooler(){ 
	}
	
	/**
	 * metodo statico che ritorna una istanza della classe,
	 * se non esiste l'istanza viene creata 
	 * aggiungere la keyword synchronized in ambito multithreading
	 * @return instance
	 */
	public static PrinterSpooler getInstance(){
		if(instance == null)
			instance = new PrinterSpooler();
		return instance;
	}
	
	public void print(String msg){
		System.out.println(msg);
	}
}
