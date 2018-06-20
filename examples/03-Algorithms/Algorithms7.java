import java.util.Scanner;

public class Algorithms7
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the numbers to sum: ");
		int totalNumberToSum = in.nextInt();
		int count = 0;
		int sum = 0;

		while (count < totalNumberToSum)
		{
			count = count + 1;
			sum = sum + count;

			System.out.println("The count is " + count + " and the current sum is: " + sum);
		}
	}
}