public class Person
{
	private static int numPeopleTotal;
	public String name;

	public Person(String name)
	{
		this.name = name;
		numPeopleTotal++;

		System.out.println("Name entered: " + this.name + ", and total people so far: " + numPeopleTotal);
	}

	public static int getTotalPeople()
	{
		return numPeopleTotal;
	}
}