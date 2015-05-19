package it.cira.snippets.polimorfismo;

public class MainClass {

	public static void main(String[] args) {
		
		AutoPilota	autoPilota 			= new AutoPilota();
		Auto 		auto 				= new Auto();
		Autocarro 	autoCarro 			= new Autocarro();
		
		autoPilota.guida(auto);
		autoPilota.guida(autoCarro);
		
		AutoPilota2 	autoPilota2 	= new AutoPilota2();
		Auto2 			auto2 			= new Auto2();
		AutoCarro2 		autocarro2 		= new AutoCarro2();
		
		autoPilota2.guida(auto2);
		autoPilota2.guida(autocarro2);
		
		
	}
}
