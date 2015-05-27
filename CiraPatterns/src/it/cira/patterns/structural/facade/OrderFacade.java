package it.cira.patterns.structural.facade;
public class OrderFacade {
	private Payment pymt = new Payment();
	private Inventory inventory = new Inventory();

	public void placeOrder(String orderId) {
		boolean check = inventory.checkInventory(orderId);
		if(check){
			String invoiceNumber = pymt.deductPayment(orderId);
			System.out.println("Order placed correctly!");
			System.out.println("Invoice Number: " + invoiceNumber);
		}
		else
			System.out.println("Check Inventory failed!");
	}
}