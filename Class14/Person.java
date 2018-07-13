public class Person
{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean equals(Person otherPerson)
	{
		return (firstName.equals(otherPerson.firstName) && 
			    lastName.equals(otherPerson.lastName));
	}
}