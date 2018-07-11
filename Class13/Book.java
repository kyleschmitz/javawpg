public class Book
{
	private String _name;
	private String _author;
	private int _numberOfCopies;
	private int _lentCopies;

	public Book()
	{
		_name = "Default";
		_author = "Default";
		_numberOfCopies = 0;
		_lentCopies = 0;
	}

	public Book(String name, String author, int numberOfCopies)
	{
		_name = name;
		_author = author;
		_numberOfCopies = numberOfCopies;
		_lentCopies = 0;
	}

	public String toString()
	{
		return _name + ", by " + _author + ". " + _lentCopies + " copies lent out from " + _numberOfCopies + " total.";
	}
}