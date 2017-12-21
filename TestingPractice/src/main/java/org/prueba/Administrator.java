package org.prueba;

import java.util.ArrayList;

public class Administrator extends User {

	public Administrator(String userName, String password) {
		super(userName, password);
	}
	
	public boolean exists () throws Exception {
		ArrayList<Administrator> admins = BrokerDB.getAgente().getAdmins();
		
		for(int i=0; i<admins.size(); i++) {
			if(admins.get(i).getUserName().equals(this.userName) && admins.get(i).getPassword().equals(this.password)) {
				return true;
			}
		}
		
		return false;
	}

}