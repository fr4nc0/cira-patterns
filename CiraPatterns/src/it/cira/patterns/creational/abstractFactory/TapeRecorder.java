package it.cira.patterns.creational.abstractFactory;

public class TapeRecorder implements Recorder {
	Tape tapeInside;

	@Override
	public void accept(Media media) {
		tapeInside = (Tape)media;

	}

	@Override
	public void record(String sound) {
		if(tapeInside == null)
			System.out.println("Error: Insert a tape.");
		else
			tapeInside.saveOnTape(sound);
	}

}
