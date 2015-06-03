package it.cira.patterns.behavior.interpreter;

public class InterpreterPatternDemo {

	//Regola: Francesco e Giuseppe sono maschi
	public static Espressione getEspressioneMaschi(){
		
		Espressione francesco 	= new EspressioneTerminale("Francesco");
		Espressione giuseppe 	= new EspressioneTerminale("Giuseppe");
		Espressione espr1 		= new EspressioneOR(francesco, giuseppe);
		Espressione giovanni	= new EspressioneTerminale("Giovanni");
		
		return new EspressioneOR(espr1, giovanni);		
	}

	
	//Regola: Federica è una donna sposata
	public static Espressione getEspressioneDonneSposate(){
		Espressione federica	= new EspressioneTerminale("Federica");
		Espressione sposata 	= new EspressioneTerminale("sposata");
		Espressione espr1 		= new EspressioneAND(federica, sposata);
		
		Espressione antonella	= new EspressioneTerminale("Antonella");
		Espressione espr2 		= new EspressioneAND(antonella, sposata);
		
		return new EspressioneOR(espr1, espr2);
	}

	public static void main(String[] args) {
		Espressione isMaschio 		= getEspressioneMaschi();
		Espressione isDonnaSposata 	= getEspressioneDonneSposate();

		System.out.println("Giuseppe è maschio? "  + isMaschio.interpreta("Giuseppe"));
		System.out.println("Giovanni è maschio? "  + isMaschio.interpreta("Giovanni"));
		System.out.println("Francesco è maschio? " + isMaschio.interpreta("Francesco"));
		
		System.out.println("Federica  è una donna sposata? " + isDonnaSposata.interpreta("sposata Federica"));
		System.out.println("Federica  è una donna sposata? " + isDonnaSposata.interpreta("Federica sposata"));
		System.out.println("Antonella è una donna sposata? " + isDonnaSposata.interpreta("Antonella sposata"));
	}
}
