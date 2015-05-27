package it.cira.patterns.structural.proxy;

public class ImmagineReale implements Immagine{

	private String fileName;

	public ImmagineReale(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}

	@Override
	public void visualizza() {
		System.out.println("Visualizzazione di: " + fileName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("Caricamento di: " + fileName);
	}

}
