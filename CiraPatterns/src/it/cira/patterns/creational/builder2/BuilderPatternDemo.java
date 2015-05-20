package it.cira.patterns.creational.builder2;

public class BuilderPatternDemo {
	public static void main(String[] args) {

		MenuBuilder menuBuilder = new MenuBuilder();

		System.out.println("Menu vegetale");
		Menu menuVegetale = menuBuilder.preparaMenuVegetale();
		menuVegetale.showItems();
		System.out.println("Costo totale: " + menuVegetale.getCost());


		System.out.println("Menu di pollo");
		Menu menuDiPollo = menuBuilder.preparaMenuDiPollo();
		menuDiPollo.showItems();
		System.out.println("Costo totale: " + menuDiPollo.getCost());

	}
}
