import java.util.Scanner;

public class Library
{
	public static final int NUMBER_OF_BOOKS = 3;

	public static void main(String[] args)
	{
		Book[] books = new Book[NUMBER_OF_BOOKS];

		for(int i=0; i<NUMBER_OF_BOOKS; i++)
		{
			String bookName;
			int numberOfPages;

			Scanner scanner = new Scanner(System.in);

			System.out.print("Please enter the book's name: ");
			bookName = scanner.nextLine();

			System.out.print("Please enter the number of pages in the book: ");
			numberOfPages = scanner.nextInt();

			books[i] = new Book(bookName, numberOfPages);
		}

		int indexOfLargestBook = FindLargestBook(books);
		Book largestBook = books[indexOfLargestBook];

		System.out.println("The book " + largestBook.name + " is the biggest with " + largestBook.numberOfPages + " pages.");
		System.out.println("You will need " + largestBook.GetPaperRequired() + " pieces of paper to print the book.");
	}

	public static int FindLargestBook(Book[] books)
	{
		int indexOfLargestBook = 0;
		for(int i=1; i<NUMBER_OF_BOOKS; i++)
		{
			if (books[i].numberOfPages > books[indexOfLargestBook].numberOfPages)
			{
				indexOfLargestBook = i;
			}
		}

		return indexOfLargestBook;
	}
}