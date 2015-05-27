package it.cira.patterns.structural.facade;
public class Payment {
	private Invoice invoice;
	
	public String deductPayment(String orderID) {
		Double amount = 100.29;
		invoice = new Invoice();
		invoice.createInvoice(orderID, amount);
		System.out.println("Payment deducted successfully");
		return invoice.getInvoiceNumber();
	}
}