package it.cira.patterns.creational.prototype;

public class Applicazione {
		public static void main(String[] args) {
			CacheProdotto.caricaCache();

			Libro clonedBook = (Libro) CacheProdotto.getProdotto("B1");
			System.out.println("SKU = " + clonedBook.getSKU());
			System.out.println("SKU = " + clonedBook.getDescrizione());
			System.out.println("SKU = " + clonedBook.getNumeroDiPagine());

			DVD clonedDVD = (DVD) CacheProdotto.getProdotto("D1");
			System.out.println("SKU = " + clonedDVD.getSKU());
			System.out.println("SKU = " + clonedDVD.getDescrizione());
			System.out.println("SKU = " + clonedDVD.getDurata());
		}
	}