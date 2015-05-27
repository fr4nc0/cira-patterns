package it.cira.patterns.creational.factoryMethod2;

import it.cira.patterns.creational.factoryMethod2.Cerchio2;
import it.cira.patterns.creational.factoryMethod2.Quadrato2;
import it.cira.patterns.creational.factoryMethod2.Rettangolo2;
import it.cira.patterns.creational.factoryMethod.Shape;

public class ConcreteShapeFactory implements ShapeFactory2 {

	
	@Override
	public Shape getShape(String shapeType) {
		
		
		if(shapeType == null){
			return null;
		}		

		if(shapeType.equalsIgnoreCase("CERCHIO")){

			//Cerchio2 cerchio	= (Cerchio2) Cerchio2.createNew(); //perchè è necessario il CAST?
			Shape cerchio	=  Cerchio2.createNew(); //perchè è necessario il CAST?
			cerchio.setColor("Bianco");
			//cerchio.setRadius(6);
			return cerchio;

		} else if(shapeType.equalsIgnoreCase("RETTANGOLO")){

			Rettangolo2 rettangolo = (Rettangolo2) Rettangolo2.createNew();
			rettangolo.setColor("Rosso");
			rettangolo.setEdge1(8);
			rettangolo.setEdge2(6);
			return rettangolo;

		} else if(shapeType.equalsIgnoreCase("QUADRATO")){

			Quadrato2 quadrato = (Quadrato2) Quadrato2.createNew();
			quadrato.setColor("Verde");
			quadrato.setEdge(4);
			return quadrato;
		}

		return null;
		
	}

	
}
