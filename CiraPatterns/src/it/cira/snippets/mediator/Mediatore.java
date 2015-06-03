package it.cira.snippets.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediatore implements InterfacciaMediatore {
	private List<CollegaAstratto> utenti;
    
    public Mediatore(){
        this.utenti = new ArrayList<>();
    }
     
    @Override
    public void aggiungiUtente(CollegaAstratto utente){
        this.utenti.add(utente);
    }
     
    @Override
    public void inviaMessaggio(String messaggio, CollegaAstratto utente) {
    	
    	// invia il messaggio a tutti gli utenti della chat
    	for(CollegaAstratto u : this.utenti){
        	
            //il messaggio non dovrebbe essere ricevuto dall'utente che l'ha inviato
            if(u != utente){
                u.ricevi(messaggio);
            }
        }
    }
}
