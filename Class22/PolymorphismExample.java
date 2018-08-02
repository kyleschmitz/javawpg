public class PolymorphismExample
{
	public static void main(String[] args)
	{
		Buyer buyer = new Buyer();
		Seller seller = new Seller();

		User user = buyer;

		Seller buyer2 = (Seller)user;
	}
}