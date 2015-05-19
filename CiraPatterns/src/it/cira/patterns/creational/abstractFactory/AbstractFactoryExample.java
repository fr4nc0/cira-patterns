package it.cira.patterns.creational.abstractFactory;

public class AbstractFactoryExample {
	
	public static void main ( String[] arg ) {
		Client client = new Client();
		System.out.println( "Testing tape devices" );
		client.selectTechnology( new TapeDevicesFactory() );
		client.test( "Volare oh oh..." );
		System.out.println( "Testing CD devices" );
		client.selectTechnology( new CDDevicesFactory() );
		client.test( "Con te partirò" );
	}
}
