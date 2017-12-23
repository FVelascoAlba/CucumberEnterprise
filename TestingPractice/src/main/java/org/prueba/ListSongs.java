package org.prueba;

/**
 *
 * @author nou model
 *
 */
public class ListSongs {
	/**
	 *
	 */
	private String name;
	/**
	 *
	 */
	private int id;

	/**
	 *
	 * @param idL id of the list of songs
	 */
	public ListSongs(final int idL) {
		super();
		this.id = idL;
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
	 * @param nameL name of the list of songs
	 */
	public final void setName(final String nameL) {
		this.name = nameL;
	}

	/**
	 *
	 * @return id
	 */
	public final int getId() {
		return id;
	}

	/**
	 *
	 * @param idL id of the list of songs
	 */
	public final void setId(final int idL) {
		this.id = idL;
	}

}
