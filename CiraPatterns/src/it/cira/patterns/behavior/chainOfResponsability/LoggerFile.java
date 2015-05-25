package it.cira.patterns.behavior.chainOfResponsability;

public class LoggerFile extends LoggerAstratto{

	public LoggerFile(int level){
		this.level = level;
	}

	@Override
	protected void scrivi(String messaggio) {		
		System.out.println("File::Logger: " + messaggio);
	}

}
