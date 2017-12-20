package org.prueba;

public class Song {
	private String name, artist;
	private int price;
	
	
	public Song(String name, String artist, int price) {
		super();
		this.name = name;
		this.artist = artist;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}