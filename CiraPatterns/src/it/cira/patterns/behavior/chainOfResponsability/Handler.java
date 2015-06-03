package it.cira.patterns.behavior.chainOfResponsability;

public abstract class Handler {

	protected Handler nextHandler;
	
	public abstract void handleRequest() ;
}
