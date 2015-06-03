package it.cira.patterns.behavior.mediator2;

import java.util.ArrayList;
import java.util.List;

public class MediatoreChat implements MediatoreAstrattoChat {
	private List<UtenteAstratto> utenti;
    
    public MediatoreChat(){
        this.utenti = new ArrayList<>();
    }
     
    @Override
    public void aggiungiUtente(UtenteAstratto utente){
        this.utenti.add(utente);
    }
     
    @Override
    public void inviaMessaggio(String messaggio, UtenteAstratto utente) {
    	
    	// invia il messaggio a tutti gli utenti della chat
    	for(UtenteAstratto u : this.utenti){
        	
            //il messaggio non dovrebbe essere ricevuto dall'utente che l'ha inviato
            if(u != utente){
                u.ricevi(messaggio);
            }
        }
    }
}
