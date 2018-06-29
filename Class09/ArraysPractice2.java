import java.util.Scanner;

public class ArraysPractice2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] grades = new int[5];
		int totalGrade = 0;
		int averageGrade;

		grades[0] = 70;
		grades[1] = 100;
		grades[2] = 0;
		grades[3] = 85;
		grades[4] = 9;

		for (int i = 0; i < grades.length; i++)
		{
			totalGrade += grades[i];
		}

		averageGrade = totalGrade / grades.length;

		System.out.println("The average grade is: " + averageGrade);
	}
}