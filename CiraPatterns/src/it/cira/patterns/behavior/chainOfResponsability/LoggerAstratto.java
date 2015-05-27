package it.cira.patterns.behavior.chainOfResponsability;

public abstract class LoggerAstratto {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	//prossimo elemento nella catena 
	protected LoggerAstratto prossimoLogger;

	public void setProssimoLogger(LoggerAstratto prossimoLogger){
		this.prossimoLogger = prossimoLogger;
	}

	public void messaggioLog(int level, String message){
		
		if(this.level <= level){
			scrivi(message);
		}
		
		if(prossimoLogger != null){
			prossimoLogger.messaggioLog(level, message);
		}
	}

	abstract protected void scrivi(String messaggio);

}
