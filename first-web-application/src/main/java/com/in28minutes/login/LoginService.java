package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean ValidateUser(String user, String password) {
		return (user.equals("in28Minutes") && password.equals("dummy"));
}
}
