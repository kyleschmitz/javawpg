public class FinalExample
{
	public static void main(String[] args) {
		
		Invoice myInvoice = new Invoice();
		myInvoice.changeCustomer("Bob");

		System.out.println(myInvoice.customer.name);
	}
}