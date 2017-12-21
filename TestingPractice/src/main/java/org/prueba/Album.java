package org.prueba;

import java.util.ArrayList;

public class Album extends Product {
	private String name, released_date, artist;
	private ArrayList<Song> songs = new ArrayList<Song>();

	public Album(String name, String released_date, String artist, int price) {
		super(price);
		this.name = name;
		this.released_date = released_date;
		this.artist = artist;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleased_date() {
		return released_date;
	}

	public void setReleased_date(String released_date) {
		this.released_date = released_date;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}

	public int getNSongs() {
		return getSongs().size();
	}

	public boolean equals(Album al) {
		if (al.getName().equals(this.name) && al.getReleased_date().equals(this.released_date)
				&& al.getArtist().equals(this.artist) && al.getPrice() == this.price) {
			if (songs.size() == 0) {
				return true;
			} else {
				for (int i = 0; i < songs.size(); i++) {
					if (al.getSongs().get(i).equals(this.songs.get(i))) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
