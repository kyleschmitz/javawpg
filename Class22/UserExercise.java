import java.util.Scanner;

public class UserExercise
{
	public static void main(String[] args)
	{
		Seller seller = new Seller("Kyle", "Schmitz", "kschmitz", "abc123", null);


		LoginUser(seller);
	}


	public static void LoginUser(User user)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the password: ");

		String enteredPassword = scanner.nextLine();
		boolean isPasswordCorrect = user.isPasswordCorrect(enteredPassword);
		
		while (!isPasswordCorrect)
		{
			System.out.print("Incorrect password! Try again: ");
			enteredPassword = scanner.nextLine();
			isPasswordCorrect = user.isPasswordCorrect(enteredPassword);
		}

		System.out.println("Logged in successfully!");
		System.out.println("User account cost is: " + user.getCost());


	}
}