package it.cira.patterns.behavior.mediator;

import java.util.Date;

public class ChatRoom {

	public static void showMessage(UtenteAstratto user, String message){
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}

}
