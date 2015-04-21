package it.cira.patterns.creational.singleton;

public class TestSingleton {
	public static void main(String [] args){
		PrinterSpooler p1 = PrinterSpooler.getInstance();
		p1.print("Hello World!");
		PrinterSpooler p2 = PrinterSpooler.getInstance();
		if(p1 == p2)
			System.out.println("Yes! I'm a Singleton!");
	}

	
}
