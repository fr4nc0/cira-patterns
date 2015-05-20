package it.cira.patterns.creational.prototype;

import java.util.Hashtable;

public class CacheProdotto {
		private static Hashtable<String, Prodotto> mapProdotti = new Hashtable<String, Prodotto>();

		public static Prodotto getProdotto(String codiceProdotto) {
			Prodotto cachedProdotto = (Prodotto) mapProdotti.get(codiceProdotto);
			return (Prodotto) cachedProdotto.clone();
		}

		public static void caricaCache() {
			Libro b1 = new Libro();
			b1.setDescrizione("Promessi Sposi");
			b1.setSKU("B1");
			b1.setNumeroDiPagine(100);
			mapProdotti.put(b1.getSKU(), b1);
			DVD d1 = new DVD();
			d1.setDescrizione("Superman");
			d1.setSKU("D1");
			d1.setDurata(180);
			mapProdotti.put(d1.getSKU(), d1);
		}
	}
	