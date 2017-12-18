package Domain;

public class Server {
	
	public void addSong() {}
	
	public void addAlbum() {}
	
	public void modifySong(Song s) {}
	
	public void deleteSong (Song s) {}
	
	public void deleteAlbum (Album a) {}
	
	public Song searchSong() {
		return null;
	}
	
	public void createUserManually() {}
	
	public void createUserAutomatically() {}
	
	public void deleteUser(User u) {}
	
	public void sendMessage(User u) {}
	
	public void purchaseAlbum (String name, String released_date, String artist, int price) {
		Album al = new Album();
		if (name.equals("") && released_date.equals("") && artist.equals("") && price == 0) {
			if(name.length() < 255 && relased_date.length() < 255 && artist.length() < 255 && price < 50) {
				if(payProduct(al)) {
					
				}
			}
		}
		
	}
	
	public boolean payProduct(Album al) {
		
	}
}

