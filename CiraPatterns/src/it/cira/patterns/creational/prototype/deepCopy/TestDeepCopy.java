package it.cira.patterns.creational.prototype.deepCopy;
public class TestDeepCopy { 
	
public static void main(String args[]) throws CloneNotSupportedException {
	Auto auto = new Auto ();
	auto.getRuote().put("Ruota Sinistra Post.", new Ruota("Pirelli"));
	auto.getRuote().put("Ruota Sinistra Ant.", new Ruota("Pirelli"));
	auto.getRuote().put("Ruota Destra Post.", new Ruota("Pirelli"));
	auto.getRuote().put("Ruota Destra Ant.", new Ruota("Pirelli"));
	/* Clono auto */
	Auto auto2 = (Auto) auto.clone(); 
	/* A seguito di una foratura cambio solo una ruota*/
	auto2.getRuote().put("Ruota Sinistra Post.", new Ruota("Michelin"));
	System.out.println("Oggetto Clonato e modificato");
	System.out.println("Auto 1 : " + auto.getRuote().get("Ruota Sinistra Post.").getMarca());
	System.out.println("Auto 2 : " + auto2.getRuote().get("Ruota Sinistra Post.").getMarca());
	

	System.out.println("Oggetto Clonato");
	System.out.println("Auto 1 : " +auto.getRuote().get("Ruota Sinistra Ant.").getMarca());
	System.out.println("Auto 2 : " +auto2.getRuote().get("Ruota Sinistra Ant.").getMarca());
	}
 }
