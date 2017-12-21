package org.prueba;

public class Song extends Product {
	private String name, artist;

	public Song(String name, String artist, double price) {
		super(price);
		this.name = name;
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public boolean equals(Song s) {
		if (s.getName().equals(this.name) && s.getArtist().equals(this.artist) && s.getPrice() == this.price) {
			return true;
		}
		return false;
	}

}