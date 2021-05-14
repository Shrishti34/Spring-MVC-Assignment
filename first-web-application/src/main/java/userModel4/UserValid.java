package userModel4;

public class UserValid {
	
	public boolean isUserValid(String username, String password) {
		if(username.equals("in28Minutes") && password.equals("dummy"))
			return true;
		return false;
	}

}
