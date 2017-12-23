package org.prueba;
import java.util.ArrayList;

/**
 *
 * @author nou model
 *
 */
public class User {
	/**
	 *
	 */
	private String name, surname;
	/**
	 *
	 */
	protected String userName;
	/**
	 *
	 */
	protected String password;
	/**
	 *
	 */
	private ArrayList<Song> songsBought = new ArrayList<Song>();
	/**
	 *
	 */
	private ArrayList<Album> AlbumsBought = new ArrayList<Album>();
	/**
	 *
	 */
	private int money;
	/**
	 *
	 */
	private ArrayList<ArrayList<Song>> lists;

	/**
	 *
	 */
	public User() { }

	/**
	 *
	 * @param userNameU user name
	 * @param passwordU password
	 */
	public User(final String userNameU, final String passwordU) {
		super();
		this.userName = userNameU;
		this.password = passwordU;
	}

	/**
	 *
	 * @param m money
	 */
	public final void setMoney(final int m) {
		this.money = m;
	}
	/**
	 *
	 * @return money
	 */
	public final int getMoney() {
		return this.money;
	}
	/**
	 *
	 * @return name
	 */
	public final String getName() {
		return name;
	}
	/**
	 *
	 * @param n name
	 */
	public final void setName(final String n) {
		this.name = n;
	}
	/**
	 *
	 * @return surname
	 */
	public final String getSurname() {
		return surname;
	}
	/**
	 *
	 * @param s surname
	 */
	public final void setSurname(final String s) {
		this.surname = s;
	}
	/**
	 *
	 * @return username
	 */
	public final String getUserName() {
		return userName;
	}
	/**
	 *
	 * @param userNameU user name
	 */
	public final void setUserName(final String userNameU) {
		this.userName = userNameU;
	}
	/**
	 *
	 * @return password
	 */
	public final String getPassword() {
		return password;
	}
	/**
	 *
	 * @param passwordU password
	 */
	public final void setPassword(final String passwordU) {
		this.password = passwordU;
	}
	/**
	 *
	 * @return songsBought
	 */
	public final ArrayList<Song> getsongsBought() {
		return songsBought;
	}
	/**
	 *
	 * @param sb songs bought
	 */
	public final void setsongsBought(final ArrayList<Song> sb) {
		this.songsBought = sb;
	}
	/**
	 *
	 * @return albums bought
	 */
	public final ArrayList<Album> getAlbumBought() {
		return AlbumsBought;
	}
	/**
	 *
	 * @param a album
	 */
	public final void setAlbumBought(final Album a) {
		this.AlbumsBought.add(a);
	}
	/**
	 *
	 * @return list songs
	 */
	public final ArrayList<ArrayList<Song>> getls() {
		return lists;
	}
	/**
	 *
	 * @param ls list songs
	 */
	public final void setls(final ArrayList<ArrayList<Song>> ls) {
		this.lists = ls;
	}
	/**
	 *
	 * @param us user
	 * @return boolean
	 */
	public final boolean equals(final User us) {
		if (us.getUserName().equals(this.userName)
				&& us.getPassword().equals(this.password)) {
			return true;
		}
		return false;
	}

	/**
	 *
	 * @param id id list of songs
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final boolean checkID(final int id) throws Exception {
		ArrayList<ListSongs> ls =
				BrokerDB.getAgente().getListSongs();

		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).getId() == id) {
				return true;
			}
		}

		return false;
	}

}
