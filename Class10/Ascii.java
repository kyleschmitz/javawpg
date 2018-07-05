import java.util.Scanner;

public class Ascii1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a string to convert: ");
		String userInput = scanner.nextLine();

		System.out.println("The characters in ascii are:");

		for(int i=0; i<userInput.length(); i++)
		{
			System.out.print((int)userInput.charAt(i) + " ");
		}
	}
}