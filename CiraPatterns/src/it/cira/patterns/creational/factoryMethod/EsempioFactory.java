package it.cira.patterns.creational.factoryMethod;

public class EsempioFactory {

	   public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      /*
	       * richiede un oggetto di tipo cerchio e lo disegna
	       */
	      Shape cerchio = shapeFactory.getShape("CERCHIO");
	      cerchio.draw();

	      /*
	       * richiede un oggetto di tipo rettangolo e lo disegna
	       */
	      Shape rettangolo = shapeFactory.getShape("RETTANGOLO");
	      rettangolo.draw();

	      /*
	       * richiede un oggetto di tipo quadrato e lo disegna
	       */
	      Shape quadrato = shapeFactory.getShape("QUADRATO");
	      quadrato.draw();
	   }
	}