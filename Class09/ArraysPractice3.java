import java.util.Scanner;

public class ArraysPractice3
{
	public static void main(String[] args)
	{
		int[][] grades;
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents;
		int numberOfGrades;

		System.out.print("Please enter the number of students: ");
		numberOfStudents = scanner.nextInt();

		System.out.print("Please enter the number of grades for each student: ");
		numberOfGrades = scanner.nextInt();

		grades = ReadGradesForStudents(numberOfStudents, numberOfGrades);

		PrintAverageGradePerStudent(grades);

		PrintAverageGradeForAllStudents(grades);
	}

	public static int[][] ReadGradesForStudents(int numberOfStudents, int numberOfGrades)
	{
		Scanner scanner = new Scanner(System.in);
		int[][] grades = new int[numberOfStudents][numberOfGrades];

		for (int i = 0; i < grades.length; i++)
		{
			System.out.println();
			for (int j = 0; j < grades[0].length; j++)
			{
				System.out.print("Enter grade " + (j + 1) + " for student " + (i + 1) + ": ");
				grades[i][j] = scanner.nextInt();
			}
		}

		return grades;
	}

	public static void PrintAverageGradePerStudent(int[][] grades)
	{
		System.out.println();

		for (int i = 0; i < grades.length; i++)
		{
			int averageGrade = 0;
			for (int j = 0; j < grades[0].length; j++)
			{
				averageGrade += grades[i][j];
			}
			averageGrade /= grades[0].length;
			System.out.println("The average grade for student " + (i + 1) + " is: " + averageGrade);
		}
	}

	public static void PrintAverageGradeForAllStudents(int[][] grades)
	{
		System.out.println();

		int averageGrade = 0;
		for (int i = 0; i < grades.length; i++)
		{
			for (int j = 0; j < grades[i].length; j++)
			{
				averageGrade += grades[i][j];
			}
		}
		averageGrade /= (grades.length * grades[i].length);
		System.out.println("The average grade for all the students is: " + averageGrade);
	}
}