package it.cira.patterns.creational.abstractFactory;

public class TestAbstractFactory {
	public static void main(String [] args){
		Client client = new Client();
		
		System.out.println("Testing Tape Devices");
		client.selectTechnology(new TapeDevicesFactory());
		client.test("Volare oh oh!");

		System.out.println("Testing CD Devices");
		client.selectTechnology(new CDDevicesFactory());
		client.test("Con te partirò!");
		
	}

}
