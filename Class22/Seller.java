public class Seller extends User
{
	private Product[] products;

	public Seller(String firstName, String lastName, String username, String password, Product[] products)
	{
		super(firstName, lastName, username, password);
		
		this.products = products;
	}

	public double getCost()
	{
		return 10;
	}
}