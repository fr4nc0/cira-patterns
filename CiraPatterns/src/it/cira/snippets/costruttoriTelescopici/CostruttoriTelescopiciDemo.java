package it.cira.snippets.costruttoriTelescopici;

public class CostruttoriTelescopiciDemo {

	 public static void main(String[] args) {
		 
		 Computer computer1	= new Computer("HDD 500 GB", "RAM 32 MB", true, true, 1.0d);
		 
		 Computer computer2	= new Computer("HDD 500 GB", "RAM 32 MB");
		 
		 //Computer computer3	= new Computer("HDD 500 GB", "RAM 32 MB", null, null, 1.0d);
		 
		 Computer computer4	= new Computer("HDD 500 GB", "RAM 32 MB", true);

		 
	 }
}
