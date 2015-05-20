package it.cira.patterns.creational.prototype;

public abstract class Prodotto implements Cloneable {
		private String SKU;
		private String descrizione;	
		
		@Override
		public Object clone() {
			Object clone = null;
			try {
				clone = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			return clone;
		}
		public String getDescrizione() {
			return descrizione;
		}
		public String getSKU() {
			return SKU;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		public void setSKU(String string) {
			SKU = string;
		}
	}
	