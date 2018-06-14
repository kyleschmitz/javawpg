import java.util.Scanner;

public class Algorithms4
{
	public static void main(String[] args)
	{
		int firstNumber;
		int secondNumber;
		int product;
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the first number: ");
		firstNumber = in.nextInt();

		System.out.print("Please enter the second number: ");
		secondNumber = in.nextInt();

		product = firstNumber * secondNumber;
		System.out.println("The product of both numbers is: " +  product);
	}
}