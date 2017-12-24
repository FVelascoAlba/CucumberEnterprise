package org.prueba;

import java.util.ArrayList;

/**
 *
 * @author nou model
 *
 */

public class Album extends Product {
	/**
	 *
	 */
	private String name, releasedDate, artist;
	/**
	 *
	 */
	private ArrayList<Song> songs = new ArrayList<Song>();

	/**
	 *
	 * @param nameAl name album
	 * @param releasedDateAl released date of album
	 * @param artistAl artist of the album
	 * @param price price of the album
	 */
	public Album(final String nameAl, final String releasedDateAl,
			final String artistAl, final int price) {
		super(price);
		this.name = nameAl;
		this.releasedDate = releasedDateAl;
		this.artist = artistAl;
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
	 * @param nameAl name of the album
	 */
	public final void setName(final String nameAl) {
		this.name = nameAl;
	}

	/**
	 *
	 * @return releasedDate
	 */

	public final String getreleasedDate() {
		return releasedDate;
	}

	/**
	 *
	 * @param releasedDateAl released date of the album
	 */

	public final void setreleasedDate(final String releasedDateAl) {
		this.releasedDate = releasedDateAl;
	}

	/**
	 *
	 * @return artist
	 */
	public final String getArtist() {
		return artist;
	}

	/**
	 *
	 * @param artistAl artist of the album
	 */
	public final void setArtist(final String artistAl) {
		this.artist = artistAl;
	}

	/**
	 *
	 * @return songs
	 */
	public final ArrayList<Song> getSongs() {
		return songs;
	}

	/**
	 *
	 * @param songsAl songs of the album
	 */
	public final void setSongs(final ArrayList<Song> songsAl) {
		this.songs = songsAl;
	}

	/**
	 *
	 * @return nsongs
	 */
	public final int getNSongs() {
		int n = getSongs().size();
		return n;
	}

	/**
	 *
	 * @param al album to compare
	 * @return boolean
	 */
	public final boolean equals(final Album al) {
		String rl  = al.getreleasedDate();
		if (al.getName().equals(this.name)
				&& rl.equals(this.releasedDate)
				&& al.getArtist().equals(this.artist)
				&& al.getPrice() == this.price) {
			if (songs.size() == 0) {
				return true;
			} else {
				int size = songs.size();
				for (int i = 0; i < size; i++) {
					Song s = al.getSongs().get(i);
					if (s.equals(this.songs.get(i))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * @param o an instance of an object
	 * @return boolean
	 */
	public final boolean equals(Object o) {
		return super.equals(o);
	}

	/**
	 * @return the hashCode of the object
	 */
	public final int hashCode() {
		assert false : "hashCode not designed";
	return 42; // any arbitrary constant will do
	}
}
