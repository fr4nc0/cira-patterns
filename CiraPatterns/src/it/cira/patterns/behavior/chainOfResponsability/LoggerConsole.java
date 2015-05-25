package it.cira.patterns.behavior.chainOfResponsability;

public class LoggerConsole extends LoggerAstratto{

	public LoggerConsole(int level){
		this.level = level;
	}

	@Override
	protected void scrivi(String messaggio) {		
		System.out.println("Standard Console::Logger: " + messaggio);
	}

}
