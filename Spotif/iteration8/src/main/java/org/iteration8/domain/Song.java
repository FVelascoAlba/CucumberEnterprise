package Domain;

public class Song {
	private String name, artist;
	private int price;
	private Album album;
	
	
	public Song(String name, String artist, int price, Album album) {
		super();
		this.name = name;
		this.artist = artist;
		this.price = price;
		this.album = album;
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
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
}