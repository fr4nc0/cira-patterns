package it.cira.patterns.structural.proxy;

public class ImmagineProxy implements Immagine {


	private ImmagineReale immagineReale;
	private String fileName;

	public ImmagineProxy(String fileName){
		this.fileName = fileName;
	}

	@Override
	public void visualizza() {
		if(immagineReale == null){
			immagineReale = new ImmagineReale(fileName);
		}
		immagineReale.visualizza();
	}
}
