package it.cira.patterns.creational.prototype.deepCopy;
public class Ruota implements Cloneable {
	private String marca;
	
	public Ruota (String marca){
		this.marca = marca;
	}
	
	public Ruota clone() throws CloneNotSupportedException { 
		return (Ruota) super.clone(); 
		}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	} 
	
	
} 
