public abstract class User
{
	protected String firstName;
	protected String lastName;
	protected String username;
	private String password;

	public User(String firstName, String lastName, String username, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}

	public final boolean isPasswordCorrect(String password)
	{
		return this.password.equals(password);
	}

	public abstract double getCost();
}