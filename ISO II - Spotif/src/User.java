import java.util.ArrayList;

public class User {

	private String name;
	private String surname;
	private String userName;
	private String password;
	private ArrayList<Song> songs_bought;
	private ArrayList<Album> albums_bought;
	private ArrayList<ArrayList<Song>> ListSongs;

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

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUserName() {
		return this.userName;
	}

	/**
	 * 
	 * @param userName
	 */
	public void setUsername(String userName) {
		// TODO - implement USER.setUsername
		throw new UnsupportedOperationException();
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Song> getSongsBought() {
		// TODO - implement USER.getSongsBought
		throw new UnsupportedOperationException();
	}

	public ArrayList<Album> getAlbumsBought() {
		// TODO - implement USER.getAlbumsBought
		throw new UnsupportedOperationException();
	}

}