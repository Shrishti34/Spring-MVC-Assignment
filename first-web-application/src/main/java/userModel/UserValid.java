package userModel;

public class UserValid {
	
	public boolean isUserValid(String user, String password) {
		if(user.equals("in28Minutes") && password.equals("dummy"))
			return true;
		
		return false;
	}

}
