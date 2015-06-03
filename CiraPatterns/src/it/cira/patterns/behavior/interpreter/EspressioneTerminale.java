package it.cira.patterns.behavior.interpreter;

public class EspressioneTerminale implements Espressione{

	private String dati;

	public EspressioneTerminale(String dati){
		this.dati = dati; 
	}

	@Override
	public boolean interpreta(String contesto) {

		if(contesto.contains(dati)){
			return true;
		}
		return false;
	}

}
