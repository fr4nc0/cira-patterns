package it.cira.patterns.behavior.mediator2;

public class Utente extends UtenteAstratto {
	
	public Utente(MediatoreAstrattoChat mediatore, String nome) {
        
		super(mediatore, nome);
		
		/*
		 * l'aggiunta dell'utente alla lista del mediatore potrebbe anche essere fatta qui
		 * mediatore.aggiungiUtente(this);
		 */
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
