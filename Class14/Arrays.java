import java.util.Scanner;

public class Arrays
{
	public static void main(String[] args)
	{
		final int ARRAY_LENGTH = 10;
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[ARRAY_LENGTH];
		int lastIndex = 0;

		for(int i=0; i<numbers.length - 3; i++)
		{
			numbers[i] = i+1;
			lastIndex = i;
		}

		System.out.print("Enter the index to insert to: ");
		int indexToInsert = scanner.nextInt();
		System.out.print("Enter the number to insert: ");
		int numberToInsert = scanner.nextInt();

		InsertItemIntoArray(numbers, indexToInsert, numberToInsert, lastIndex);
		lastIndex++;
	}

	public static void InsertItemIntoArray(int[] numbers, int indexToInsert, int numberToInsert, int lastIndex)
	{
		PrintArrayContents(numbers);

		for(int i=lastIndex; i>= indexToInsert; i--)
		{
			numbers[i + 1] = numbers[i];
			PrintArrayContents(numbers);
			PauseForUser();
		}
		numbers[indexToInsert] = numberToInsert;

		PrintArrayContents(numbers);
	}


	public static void PrintArrayContents(int[] numbers)
	{
		System.out.println();
		for (int i=0; i<numbers.length; i++)
		{
			System.out.print("----");
		}
		System.out.println("-");

		for (int i=0; i<numbers.length; i++)
		{
			if (numbers[i] == 0)
				System.out.print("|   ");
			else
				System.out.print("| " + numbers[i] + " ");
		}

		System.out.println("|");

		for (int i=0; i<numbers.length; i++)
		{
			System.out.print("----");
		}
		System.out.println("-");
	}

	public static void PauseForUser()
	{
		try
		{
			System.in.read();
		}
		catch(Exception e){}
	}
}