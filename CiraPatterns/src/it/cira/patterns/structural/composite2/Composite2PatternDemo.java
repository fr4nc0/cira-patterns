package it.cira.patterns.structural.composite2;

public class Composite2PatternDemo {

	public static void main(String[] args) {

		Impiegato emp1		= new Developer("John", 10000);
		Impiegato emp2		= new Developer("David", 15000);
		Impiegato manager1	= new Manager("Daniel",25000);

		manager1.add(emp1);
		manager1.add(emp2);

		Impiegato emp3			= new Developer("Michael", 20000);
		Manager generalManager	= new Manager("Mark", 50000);

		generalManager.add(emp3);
		generalManager.add(manager1);

		generalManager.print();
	}
}