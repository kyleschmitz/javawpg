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
					TakeOutABook(books, lastIndex);
					break;
				case 4:
					ReturnABook(books);
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

	public static Book FindBookByName(String name, Book[] books, int lastIndex)
	{
		int indexOfFoundBook = -1;

		for (int i=0; i<lastIndex; i++)
		{
			if(books[i].getName().equals(name))
			{
				indexOfFoundBook = i;	
			}
		}

		if (indexOfFoundBook != -1)
		{
			return books[indexOfFoundBook];
		}
		else
		{
			return null;
		}
	}

	public static void TakeOutABook(Book[] books, int lastIndex)
	{
		Scanner scanner = new Scanner(System.in);
		String name;

		//Prompt user for book to take out, and get book.
		System.out.println();
		System.out.print("Please enter the name of the book to take out: ");
		name = scanner.nextLine();

		Book selectedBook = FindBookByName(name, books, lastIndex);
		if (selectedBook == null)
		{
			System.out.println("Book not found");
		}
		else
		{
			boolean successful = selectedBook.LendCopy();

			if (successful)
			{
				System.out.println("Took out book " + selectedBook.getName()  + " successfully.");
				System.out.println("There are " + selectedBook.getRemainingCopies() + " copies left in stock.");
			}
			else
			{
				System.out.println("Sorry, all copies are out of stock.");
			}
		}
	}

	public static void ReturnABook(Book[] books)
	{
		Scanner scanner = new Scanner(System.in);
		int index;

		System.out.println();
		System.out.print("Please enter the index of the book to return: ");
		index = scanner.nextInt();

		Book selectedBook = books[index];
		boolean successful = selectedBook.ReturnCopy();

		if (successful)
		{
			System.out.println("Returned the book " + selectedBook.getName() + " succesfully.");
			System.out.println("There are " + selectedBook.getRemainingCopies() + " copies left in stock.");
		}
		else
		{
			System.out.println("Sorry, all copies have already been returned");
		}
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