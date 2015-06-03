package it.cira.snippets.noChain;

import it.cira.patterns.behavior.chainOfResponsability.LoggerConsole;
import it.cira.patterns.behavior.chainOfResponsability.LoggerErrore;
import it.cira.patterns.behavior.chainOfResponsability.LoggerFile;

public class EsempioNoChain {

	public static void main(String[] args) {
		LoggerConsole 	loggerConsole 	= new LoggerConsole(0);
		LoggerFile 		loggerFile 		= new LoggerFile(0);
		LoggerErrore 	loggerErrore 	= new LoggerErrore(0);

		// log di info
		loggerConsole.messaggioLog(0, "messaggio di tipo INFO");
		
		// log di tipo DEBUG
		loggerConsole.messaggioLog(0, "messaggio di tipo DEBUG");
		loggerFile.messaggioLog(0, "messaggio di tipo DEBUG");
		
		// log di tipo ERRORE
		loggerConsole.messaggioLog(0, "messaggio di tipo ERRORE");
		loggerFile.messaggioLog(0, "messaggio di tipo ERRORE");
		loggerErrore.messaggioLog(0, "messaggio di tipo ERRORE");
	}
}
