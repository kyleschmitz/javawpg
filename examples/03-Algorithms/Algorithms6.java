import java.util.Scanner;

public class Algorithms6
{
	public static void main(String[] args)
	{
		String studentGrade;
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your grade for the class: ");
		studentGrade = in.next();

		switch(studentGrade)
		{
			case "A":
				System.out.println("Great mark! Congratulations!");
				break;
			case "B":
			case "C":
				System.out.println("Good work, you pass.");
				break;
			case "D":
				System.out.println("You can do better!");
				break;
			case "F":
				System.out.println("You have failed the class.");
				break;
			default:
				System.out.println("Not a valid grade.");
				break;
		}
	}
}