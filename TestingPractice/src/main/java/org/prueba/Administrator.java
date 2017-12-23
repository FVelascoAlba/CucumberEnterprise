package org.prueba;

import java.util.ArrayList;

/**
 *
 * @author nou model
 *
 */
public class Administrator extends User {

	/**
	 *
	 * @param userName user name
	 * @param password password
	 */
	public Administrator(final String userName, final String password) {
		super(userName, password);
	}

	/**
	 *
	 * @return boolean
	 * @throws Exception throws Exception
	 */
	public final boolean exists() throws Exception {
		ArrayList<Administrator> admins =
				BrokerDB.getAgente().getAdmins();

		for (int i = 0; i < admins.size(); i++) {
			Administrator a = admins.get(i);
			String pwd = a.getPassword();
			String un = a.getUserName();
			if (un.equals(this.userName)
					&& pwd.equals(this.password)) {
				return true;
			}
		}

		return false;
	}

}
