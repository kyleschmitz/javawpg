import java.util.Scanner;

public class ScopeExample
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String username = "Kyle";

		if (username == "Kyle")
		{
			String password = scanner.next();
		}

		if (password == "abc123")
		{
			System.out.println("User logged in!");
		}

	}
}