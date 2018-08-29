package com.comit;

public class UserValidationService
{	
	private User[] validUsers;
	
	public UserValidationService(User[] validUsers)
	{
		this.validUsers = validUsers;
	}
	
	public boolean isUserValid(String username, String password)
	{
		boolean userValid = false;
		
		for (int i = 0; i < validUsers.length; i++)
		{
			User currentUser = validUsers[i];
			
			if (currentUser.getUsername().equals(username) && currentUser.getPassword().equals(password))
			{
				userValid = true;
				break;
			}
		}
		
		return userValid;
	}
}
