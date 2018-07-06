public class Book
{
	public String name;
	public int numberOfPages;

	public int GetPaperRequired()
	{
		return (numberOfPages / 2) + (numberOfPages % 2);
	}

	public Book(String newName, int newNumberOfPages)
	{
		name = newName;
		numberOfPages = newNumberOfPages;
	}
}