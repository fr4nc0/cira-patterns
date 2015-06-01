package it.cira.patterns.behavior.mediator;

public class MediatorPatternDemo {
	
	public static void main(String[] args) {
		UtenteAstratto robert = new UtenteAstratto("Robert");
		UtenteAstratto john = new UtenteAstratto("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}