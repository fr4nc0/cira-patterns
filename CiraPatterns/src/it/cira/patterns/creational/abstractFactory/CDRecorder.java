package it.cira.patterns.creational.abstractFactory;

public class CDRecorder implements Recorder {
	CD cDInside;

	@Override
	public void accept(Media media) {
		cDInside = (CD)media;
		System.out.println("CD Inserted.");

	}

	@Override
	public void record(String sound) {
		System.out.println("Recording CD");
		if(cDInside == null)
			System.out.println("Error: No CD.");
		else
			cDInside.writeOnDisk(sound);

	}

}
