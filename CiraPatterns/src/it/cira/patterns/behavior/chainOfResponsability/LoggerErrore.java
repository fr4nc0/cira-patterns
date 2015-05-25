package it.cira.patterns.behavior.chainOfResponsability;

public class LoggerErrore extends LoggerAstratto {

	public LoggerErrore(int level){
		this.level = level;
	}

	@Override
	protected void scrivi(String messaggio) {		
		System.out.println("Error Console::Logger: " + messaggio);
	}

}
