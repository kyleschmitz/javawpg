package com.comit;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserValidationServiceTests {

	@Test
	public void login_should_return_true_if_username_and_password_are_correct()
	{
		//Arrange
		User[] validUsers = new User[] { new User("Kyle", "abc123") };
		UserValidationService sut = new UserValidationService(validUsers);

		//Act
		Boolean result = sut.isUserValid("Kyle", "abc123");

		//Assert
		assertTrue(result);
	}

	@Test
	public void login_should_return_false_if_password_is_incorrect()
	{
		//Arrange
		User[] validUsers = new User[] { new User("Kyle", "abc123") };
		UserValidationService sut = new UserValidationService(validUsers);

		//Act
		Boolean result = sut.isUserValid("Kyle", "efg456");

		//Assert
		assertFalse(result);
	}

	@Test
	public void login_should_return_false_if_username_is_incorrect()
	{
		//Arrange
		User[] validUsers = new User[] { new User("Kyle", "abc123") };
		UserValidationService sut = new UserValidationService(validUsers);

		//Act
		Boolean result = sut.isUserValid("Bob", "abc123");

		//Assert
		assertFalse(result);
	}
}
