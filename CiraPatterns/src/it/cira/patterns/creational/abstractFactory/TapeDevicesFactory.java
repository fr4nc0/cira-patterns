package it.cira.patterns.creational.abstractFactory;

public class TapeDevicesFactory implements DevicesFactory {

	@Override
	public Media createMedia() {
		return new Tape();
	}

	@Override
	public Player createPlayer() {
		return new TapePlayer();
	}

	@Override
	public Recorder createRecorder() {
		return new TapeRecorder();
	}

}
