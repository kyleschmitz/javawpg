public class Main
{
	public static String name;

	public static void main(String[] args)
	{
		Person person1 = new Person("Kyle");
		Person person2 = new Person("Bob");
		Person person3 = new Person("Joe");

		System.out.println("There are " + Person.getTotalPeople() + " people total.");
	}
}