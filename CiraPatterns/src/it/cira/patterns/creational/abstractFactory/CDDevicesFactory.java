package it.cira.patterns.creational.abstractFactory;

public class CDDevicesFactory implements DevicesFactory {

	@Override
	public Media createMedia() {
		return new CD();
	}

	@Override
	public Player createPlayer() {
		return new CDPlayer();
	}

	@Override
	public Recorder createRecorder() {
		return new CDRecorder();
	}

}
