package Domain;

import java.util.ArrayList;

public class User {
	private String name, surname, userName, password;
	private ArrayList<Song> songs_bought;
	private ArrayList<Album> albums_bought;
	
	public User() {}
	
	public User(String name, String surname, String userName, String password, ArrayList<Song> songs_bought,
			ArrayList<Album> albums_bought, ArrayList<ArrayList<Song>> list_songs) {
		super();
		this.name = name;
		this.surname = surname;
		this.userName = userName;
		this.password = password;
		this.songs_bought = songs_bought;
		this.albums_bought = albums_bought;
		this.list_songs = list_songs;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<Song> getSongs_bought() {
		return songs_bought;
	}
	public void setSongs_bought(ArrayList<Song> songs_bought) {
		this.songs_bought = songs_bought;
	}
	public ArrayList<Album> getAlbums_bought() {
		return albums_bought;
	}
	public void setAlbums_bought(ArrayList<Album> albums_bought) {
		this.albums_bought = albums_bought;
	}
	public ArrayList<ArrayList<Song>> getList_songs() {
		return list_songs;
	}
	public void setList_songs(ArrayList<ArrayList<Song>> list_songs) {
		this.list_songs = list_songs;
	}
	ArrayList<ArrayList<Song>> list_songs;
}