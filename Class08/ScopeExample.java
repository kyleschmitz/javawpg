import java.util.Scanner;

public class ScopeExample
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String username = "Kyle";

		if (username.equals("Kyle"))
		{
			String password = scanner.next();
		}

		if (password.equals("abc123")) //Cannot access password here because it is not part of the correct scope.
		{
			System.out.println("User logged in!");
		}
	}
}