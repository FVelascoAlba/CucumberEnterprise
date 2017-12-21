package org.prueba;

import java.util.ArrayList;

public class Regular extends User {

	public Regular(String userName, String password) {
		super(userName, password);
	}

	public boolean exists() throws Exception {
		ArrayList<Regular> regUsers = BrokerDB.getAgente().getRegularUsers();
		
		for(int i=0; i<regUsers.size(); i++) {
			if(regUsers.get(i).getUserName().equals(this.userName) && regUsers.get(i).getPassword().equals(this.password)) {
				System.out.println(regUsers.get(i).getUserName());
				return true;
			}
		}
		
		return false;
	}

}