package Domain;

public class Email {
	private String source, destination, content;

	public Email(String source, String destination, String content) {
		super();
		this.source = source;
		this.destination = destination;
		this.content = content;
	}
	
	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}