package org.prueba;

/**
 *
 * @author nou model
 *
 */
public class Email {
	/**
	 *
	 */
	private String content;
	/**
	 *
	 */
	private Administrator source;
	/**
	 *
	 */
	private Regular destination;


	/**
	 *
	 * @param contentE text of the email
	 */
	public Email(final String contentE) {
		super();
		this.content = contentE;
	}



	/**
	 *
	 * @return source
	 */
	public final Administrator getSource() {
		return source;
	}

	/**
	 *
	 * @param sourceE source of the email
	 */
	public final void setSource(final Administrator sourceE) {
		this.source = sourceE;
	}

	/**
	 *
	 * @return destination
	 */
	public final Regular getDestination() {
		return destination;
	}

	/**
	 *
	 * @param destinationE destination of the email
	 */
	public final void setDestination(final Regular destinationE) {
		this.destination = destinationE;
	}

	/**
	 *
	 * @return content
	 */
	public final String getContent() {
		return content;
	}

	/**
	 *
	 * @param contentE content of the email
	 */
	public final void setContent(final String contentE) {
		this.content = contentE;
	}


}
