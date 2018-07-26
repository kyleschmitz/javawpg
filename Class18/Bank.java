public class Bank
{
	public static void main(String[] args)
	{
		//This doesn't work:
		Account account = new Chequing(1000);
		account.writeCheque(200, "Bob");

		//This does work:
		Chequing chequing = new Chequing(1000);
		chequing.writeCheque(200, "Bob");
	}
}