package it.cira.patterns.behavior.chainOfResponsability;

public class ChainPatternDemo {


	private static LoggerAstratto getChainOfLoggers(){

		LoggerAstratto errorLogger 	= new LoggerErrore(LoggerAstratto.ERROR);
		LoggerAstratto fileLogger 	= new LoggerFile(LoggerAstratto.DEBUG);
		LoggerAstratto consoleLogger = new LoggerConsole(LoggerAstratto.INFO);

		errorLogger.setProssimoLogger(fileLogger);
		fileLogger.setProssimoLogger(consoleLogger);

		return errorLogger;	
	}

	public static void main(String[] args) {
		
		LoggerAstratto loggerChain = getChainOfLoggers();

		loggerChain.messaggioLog(LoggerAstratto.INFO, 
				"This is an information.");

		loggerChain.messaggioLog(LoggerAstratto.DEBUG, 
				"This is an debug level information.");

		loggerChain.messaggioLog(LoggerAstratto.ERROR, 
				"This is an error information.");
	}

}
