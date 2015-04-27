package it.cira.patterns.creational.abstractFactory;

public interface Recorder {
	public void accept(Media media);
	public void record(String sound);

}
