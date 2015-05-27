package it.cira.patterns.structural.facade;

public class Invoice {
	private String invoiceNumber;
	
	public void createInvoice(String orderID, Double amount) {
		this.invoiceNumber = "INV00001";
		System.out.println("Invoice Created successfully");

	}
	
	public String getInvoiceNumber(){
		return invoiceNumber;
	}
}