public class President extends Politician
{
	private int numberOfTerms;

	public President(int numberOfTerms, String name, int age)
	{
		super(name, age); //Must be first

		this.numberOfTerms = numberOfTerms;
	}
}