package it.cira.patterns.creational.builder2;

public class MenuBuilder {

	public Menu preparaMenuVegetale(){
		Menu menu = new Menu();
		menu.addItem(new HamburgerVegetale());
		menu.addItem(new Aranciata());
		return menu;
	}   

	public Menu preparaMenuDiPollo (){
		Menu menu = new Menu();
		menu.addItem(new HamburgerDiPollo());
		menu.addItem(new Birra());
		return menu;
	}
}
