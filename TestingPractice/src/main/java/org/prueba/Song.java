package org.prueba;

/**
 *
 * @author nou model
 *
 */
public class Song extends Product {
	/**
	 *
	 */
	private String name, artist;

	/**
	 *
	 * @param nameA name song
	 * @param artistA artist of song
	 * @param price price of song
	 */
	public Song(final String nameA,
			final String artistA, final double price) {
		super(price);
		this.name = nameA;
		this.artist = artistA;
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
	 * @param nameS name of song
	 */
	public final void setName(final String nameS) {
		this.name = nameS;
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
	 * @param artistS artist
	 */
	public final void setArtist(final String artistS) {
		this.artist = artistS;
	}

	/**
	 *
	 * @param s song
	 * @return boolean
	 */
	public final boolean equals(final Song s) {
		if (s.getName().equals(this.name)
				&& s.getArtist().equals(this.artist)
				&& s.getPrice() == this.price) {
			return true;
		}
		return false;
	}

}
