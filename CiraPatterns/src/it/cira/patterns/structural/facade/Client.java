package it.cira.patterns.structural.facade;

public class Client {
	
  public static void main(String args[]){
	  
	  OrderFacade orderFacade = new OrderFacade();
	  orderFacade.placeOrder("OR123456");
  }
}