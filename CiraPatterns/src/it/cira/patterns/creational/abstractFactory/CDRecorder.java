package it.cira.patterns.creational.abstractFactory;

public class CDRecorder implements Recorder {
	CD cDInside;

	@Override
	public void accept(Media media) {
		cDInside = (CD)media;

	}

	@Override
	public void record(String sound) {
		if(cDInside == null)
			System.out.println("Error: No CD.");
		else
			cDInside.writeOnDisk(sound);

	}

}
