package it.cira.patterns.structural.facade;

public class Inventory {
	
	public boolean checkInventory(String OrderId) {
		System.out.println("Inventory checked");
		return true;
	}
}