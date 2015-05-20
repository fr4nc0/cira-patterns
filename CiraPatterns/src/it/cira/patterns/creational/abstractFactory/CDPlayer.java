package it.cira.patterns.creational.abstractFactory;

public class CDPlayer implements Player {
	CD cDInside;

	@Override
	public void accept(Media media) {
		cDInside = (CD)media;
		System.out.println("CD Inserted.");

	}

	@Override
	public void play() {
		System.out.println("Playing CD");
		if(cDInside == null)
			System.out.println("Error: No CD.");
		else
			System.out.println(cDInside.readDisk());

	}

}
