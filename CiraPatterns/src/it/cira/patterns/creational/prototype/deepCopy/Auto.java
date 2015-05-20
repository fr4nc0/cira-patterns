package it.cira.patterns.creational.prototype.deepCopy;
import java.util.HashMap;

public class Auto implements Cloneable {
	private HashMap<String, Ruota> ruote = new HashMap<String, Ruota>();
	
	public Auto clone() throws CloneNotSupportedException { 
		Auto nuovaAuto = (Auto) super.clone();
	 	nuovaAuto.ruote = (HashMap<String, Ruota>) ruote.clone();
	 	return nuovaAuto ; 
		}
	
	public HashMap<String, Ruota> getRuote() {
		return ruote;
	}
	
	public void setRuote(HashMap<String, Ruota> ruote) {
		this.ruote = ruote;
	}
}
