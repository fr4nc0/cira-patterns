package it.cira.patterns.creational.prototype;

public class Applicazione {
		public static void main(String[] args) {
			CacheProdotto.caricaCache();

			Prodotto clonedBook = CacheProdotto.getProdotto("B1");
			System.out.println("SKU = " + clonedBook.getSKU());
			System.out.println("SKU = " + clonedBook.getDescrizione());

			Prodotto clonedDVD = CacheProdotto.getProdotto("D1");
			System.out.println("SKU = " + clonedDVD.getSKU());
			System.out.println("SKU = " + clonedDVD.getDescrizione());
		}
	}