package it.cira.patterns.creational.abstractFactory;

public class TapePlayer implements Player {
	Tape tapeInside;

	@Override
	public void accept(Media media) {
		tapeInside = (Tape)media;
		System.out.println("Tape Inserted.");
	}

	@Override
	public void play() {
		if(tapeInside == null)
			System.out.println("Error: Insert a tape.");
		else
			System.out.println(tapeInside.readTape());

	}

}
