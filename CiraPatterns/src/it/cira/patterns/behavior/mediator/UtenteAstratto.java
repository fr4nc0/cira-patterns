package it.cira.patterns.behavior.mediator;

public class UtenteAstratto {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UtenteAstratto(String name){
		this.name  = name;
	}

	public void sendMessage(String message){
		ChatRoom.showMessage(this,message);
	}
}