package it.cira.snippets.costruttoriTelescopici;

public class Computer {
    
    //parametri obbligatori
    private String 		HDD;
    private String 		RAM;
     
    //parametri opzionali
    private boolean 	isGraphicsCardEnabled;
    private boolean 	isBluetoothEnabled;
    private double		displayBrightness;
	
    
	public Computer(String hDD, String rAM, boolean isGraphicsCardEnabled,
			boolean isBluetoothEnabled, double displayBrightness) {
		super();
		HDD = hDD;
		RAM = rAM;
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.displayBrightness = displayBrightness;
	}


	public Computer(String hDD, String rAM) {
		super();
		HDD = hDD;
		RAM = rAM;
	}


	public Computer(String hDD, String rAM, boolean isGraphicsCardEnabled) {
		super();
		HDD = hDD;
		RAM = rAM;
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}


	/*
	 * questo costruttore non è possibile definirlo perchè avrebbe la stessa firma del precedente
	 * benchè si riferisca a parametri booleani diversi
	 * 
	public Computer(String hDD, String rAM, boolean isBluetoothEnabled) {
		super();
		HDD = hDD;
		RAM = rAM;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}
  	*/
    
	public Computer(String hDD, String rAM, boolean isGraphicsCardEnabled,
			double displayBrightness) {
		super();
		HDD = hDD;
		RAM = rAM;
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		this.displayBrightness = displayBrightness;
	}

	/*
	 * IDEM
	 * 
	public Computer(String hDD, String rAM, boolean isBluetoothEnabled,
			double displayBrightness) {
		super();
		HDD = hDD;
		RAM = rAM;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.displayBrightness = displayBrightness;
	}
	*/
	
 
  }
