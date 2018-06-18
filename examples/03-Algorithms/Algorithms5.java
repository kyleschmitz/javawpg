import java.util.Scanner;

public class Algorithms5
{
	public static void main(String[] args)
	{

		int total = 40;
		int subtractBy = 5;
		int count = 0;

		while(total >= 5)
		{
			total = total - subtractBy;
			count = count + 1;
		}

		System.out.println("5 can go into 40 " + count + " times.");
	}
}