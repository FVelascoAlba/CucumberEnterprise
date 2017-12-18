package Domain;
import java.util.ArrayList;

public class Album {
	private String name, released_date, artist;
	private int price;
	private ArrayList<Song> songs;
	
	public Album(String name, String released_date, String artist, int price, ArrayList<Song> songs) {
		super();
		this.name = name;
		this.released_date = released_date;
		this.artist = artist;
		this.price = price;
		this.songs = songs;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
}