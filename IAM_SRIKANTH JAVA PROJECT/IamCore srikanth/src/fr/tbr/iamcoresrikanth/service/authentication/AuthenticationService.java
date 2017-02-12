package fr.tbr.iamcore.service.authentication;

import fr.tbr.iamcore.service.dao.DerbyOperations;

public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		// FIXME implement this authentication method
		return DerbyOperations.validateUser(username.trim(),password.trim());
	}

}
