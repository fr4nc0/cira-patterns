package it.cira.patterns.behavior.mediator2;

public abstract class UtenteAstratto {

	protected MediatoreAstrattoChat mediatore;
	protected String nome;

	public UtenteAstratto(MediatoreAstrattoChat mediatore, String nome){
		this.mediatore	= mediatore;
		this.nome		= nome;
	}

	public abstract void invia(String messaggio);

	public abstract void ricevi(String messaggio);
}
