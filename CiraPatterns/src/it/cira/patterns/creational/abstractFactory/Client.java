package it.cira.patterns.creational.abstractFactory;

public class Client {
	DevicesFactory technology;
	
	public void selectTechnology(DevicesFactory df){
		technology = df;
	}

	public static void main(String [] args){
		//Tape Media
		DevicesFactory technology = new TapeDevicesFactory();
		Media media = technology.createMedia();
		Player player = technology.createPlayer();
		Recorder recorder = technology.createRecorder();
		
		recorder.accept(media);
		recorder.record("Volare oh oh!");
		
		player.accept(media);
		player.play();
		// CD Media
		technology = new CDDevicesFactory();
		media = technology.createMedia();
		player = technology.createPlayer();
		recorder = technology.createRecorder();
		
		recorder.accept(media);
		recorder.record("Con te partirò!");
		
		player.accept(media);
		player.play();
	}
	
	
	public void test(String song){
		Media media = technology.createMedia();
		Player player = technology.createPlayer();
		Recorder recorder = technology.createRecorder();
		
		recorder.accept(media);
		recorder.record(song);
		
		player.accept(media);
		player.play();
		
	}
}
