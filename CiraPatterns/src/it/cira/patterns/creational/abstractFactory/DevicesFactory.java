package it.cira.patterns.creational.abstractFactory;

public interface DevicesFactory {
	public Media createMedia();
	public Player createPlayer();
	public Recorder createRecorder();

}
