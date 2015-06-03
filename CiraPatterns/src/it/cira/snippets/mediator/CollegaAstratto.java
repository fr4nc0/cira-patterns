package it.cira.snippets.mediator;

public abstract class CollegaAstratto {

	protected InterfacciaMediatore mediatore;
	protected String nome;

	public CollegaAstratto(InterfacciaMediatore mediatore, String nome){
		this.mediatore	= mediatore;
		this.nome		= nome;
	}

	public abstract void invia(String messaggio);

	public abstract void ricevi(String messaggio);
}
