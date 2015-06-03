package it.cira.snippets.mediator;

public class Collega extends CollegaAstratto {
	
	public Collega(InterfacciaMediatore mediatore, String nome) {
        
		super(mediatore, nome);
    }
 
    @Override
    public void invia(String messaggio){
        System.out.println(this.nome + ": Invio ... " + messaggio);
        mediatore.inviaMessaggio(messaggio, this);
    }
    
    @Override
    public void ricevi(String messaggio) {
        System.out.println(this.nome + ": Ricezione ... : " + messaggio);
    }
}
