package org.prueba;


public class Email {
	private String content;
	private Administrator source;
	private Regular destination;

	public Email(String content) {
		super();
		this.content = content;
	}
	
	

	public Administrator getSource() {
		return source;
	}

	public void setSource(Administrator source) {
		this.source = source;
	}

	public Regular getDestination() {
		return destination;
	}

	public void setDestination(Regular	 destination) {
		this.destination = destination;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}