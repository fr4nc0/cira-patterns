package it.cira.patterns.creational.abstractFactory;

public class Client {
	DevicesFactory technology;
	
	public void selectTechnology(DevicesFactory df){
		technology = df;
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
