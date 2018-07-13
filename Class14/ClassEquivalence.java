import java.util.Scanner;

public class ClassEquivalence
{
	public static void main(String[] args)
	{
		Person person1 = CreateNewPerson();
		Person person2 = CreateNewPerson();

		if (person1.equals(person2))
		{
			System.out.println("The people are the same!");
		}
		else
		{
			System.out.println("The people are not the same!");
		}
	}

	public static Person CreateNewPerson()
	{
		Scanner scanner = new Scanner(System.in);
		String firstName;
		String lastName;

		System.out.print("Enter the first name: ");
		firstName = scanner.nextLine();

		System.out.print("Enter the last name: ");
		lastName = scanner.nextLine();

		return new Person(firstName, lastName);
	}
}