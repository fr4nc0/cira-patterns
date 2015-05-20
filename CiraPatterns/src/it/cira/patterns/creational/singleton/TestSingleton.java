 

package it.cira.patterns.creational.singleton;

import it.cira.patterns.creational.singleton.threadsafe.SingletonThreadSafe;

public class TestSingleton {
	public static void main(String [] args){
		PrinterSpooler p1 = PrinterSpooler.getInstance();
		p1.print("Hello World!");
		PrinterSpooler p2 = PrinterSpooler.getInstance();
		if(p1 == p2)
			System.out.println("Yes! I'm a Singleton!");
		SingletonThreadSafe a1 = SingletonThreadSafe.getInstance();
		a1.print("Hello World Safe!");
		SingletonThreadSafe a2 = SingletonThreadSafe.getInstance();
		if(a1 == a2)
			System.out.println("Yes! I'm a Singleton!");
	}

	
}
