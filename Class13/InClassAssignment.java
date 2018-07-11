import java.util.Scanner;

public class InClassAssignment
{
	public static void main(String[] args)
	{
		int selectedOption = GetSelectedOption();
		Book[] books = new Book[10];
		int lastIndex = 0;

		while (selectedOption != 1)
		{
			switch(selectedOption)
			{
				case 2:
					books[lastIndex] = CreateBook();
					lastIndex++;
					break;
				case 3:
					TakeOutABook();
					break;
				case 4:
					ReturnABook();
					break;
				case 5:
					ListAllBooks(books, lastIndex);
					break;
				default:
					System.out.println("That's not a valid option.");
					break;
			}

			selectedOption = GetSelectedOption();
		}

		System.out.println("Thanks for stopping by!");
	}

	public static Book CreateBook()
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		String author;
		int numberOfCopies;

		System.out.println();

		System.out.print("Please enter the book's name: ");
		name = scanner.nextLine();

		System.out.print("Please enter the book's author: ");
		author = scanner.nextLine();

		System.out.print("Please enter the number of copies: ");
		numberOfCopies = scanner.nextInt();

		return new Book(name, author, numberOfCopies);
	}

	public static void TakeOutABook()
	{

	}

	public static void ReturnABook()
	{

	}

	public static void ListAllBooks(Book[] books, int lastIndex)
	{
		System.out.println();

		if (lastIndex == 0)
		{
			System.out.println("There are no books!");
		}

		for(int i=0; i<lastIndex; i++)
		{
			System.out.println(books[i].toString());
		}	
	}


	public static int GetSelectedOption()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("*****");
		System.out.println();

		System.out.println("Menu Options:");
		System.out.println("1 - Quit");
		System.out.println("2 - Create a book");
		System.out.println("3 - Take out a book");
		System.out.println("4 - Return a book");
		System.out.println("5 - List all books");

		System.out.print("Please select your option: ");
		return scanner.nextInt();
	}
}