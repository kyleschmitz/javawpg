import java.util.Scanner;

public class Algorithms3
{
	public static void main(String[] args)
	{
		String username;
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter your name:");

		username = in.next();

		System.out.println("Hello, " + username + "! Thanks for stopping by!");
	}
}