package org.prueba;

import java.util.ArrayList;

/**
 *
 * @author nou model
 *
 */
public class Regular extends User {

	/**
	 *
	 * @param userName user name
	 * @param password password
	 */
	public Regular(final String userName, final String password) {
		super(userName, password);
	}

	/**
	 *
	 * @return boolean
	 * @throws Exception throws exception
	 */
	public final boolean exists() throws Exception {
		ArrayList<Regular> regUsers =
				BrokerDB.getAgente().getRegularUsers();

		for (int i = 0; i < regUsers.size(); i++) {
			User u = regUsers.get(i);
			String name = u.getUserName();
			String pwd = u.getPassword();
			if (name.equals(this.userName)
					&& pwd.equals(this.password)) {
				return true;
			}
		}

		return false;
	}

}
