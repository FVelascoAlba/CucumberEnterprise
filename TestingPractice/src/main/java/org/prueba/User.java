package org.prueba;
import java.util.ArrayList;

public class User {
	private String name, surname, userName, password;
	private ArrayList<Song> songs_bought = new ArrayList<Song>();
	private ArrayList<Album> albums_bought = new ArrayList<Album>();
	private int money;
	
	public User() {}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public void setMoney(int m) {
		this.money = m;
	}
	
	public int getMoney() {
		return this.money;
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
	public void setAlbums_bought(Album a) {
		this.albums_bought.add(a);
	}
	public ArrayList<ArrayList<Song>> getList_songs() {
		return list_songs;
	}
	public void setList_songs(ArrayList<ArrayList<Song>> list_songs) {
		this.list_songs = list_songs;
	}
	ArrayList<ArrayList<Song>> list_songs;
}