import java.awt.List;
import java.util.ArrayList;

public class Album {

	private String name;
	private String date_released;
	private String artist;
	private ArrayList<Song> songs;
	private int price;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getDate_released() {
		return this.date_released;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate_released(String date) {
		this.date_released = date;
	}

	public String getArtist() {
		return this.artist;
	}

	/**
	 * 
	 * @param artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public ArrayList<Song> getSongs() {
		return this.songs;
	}

	public int getPrice() {
		return this.price;
	}

}