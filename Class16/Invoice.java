public class Invoice
{
	public final Customer customer;

	public Invoice()
	{
		customer = new Customer("Kyle");
	}

	public void changeCustomer(String newName)
	{
		customer.name = newName;
	}
}