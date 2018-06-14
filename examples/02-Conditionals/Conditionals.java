public class Conditionals
{
	public static void main(String[] args)
	{
		boolean isUsernameTaken = false;
		boolean isUsernameLongEnough = true;
		boolean isUserAnAdmin = false;

		System.out.println("Is username taken? - " + Boolean.toString(isUsernameTaken));
		System.out.println("Is username long enough? - " + Boolean.toString(isUsernameLongEnough));
		System.out.println("Is username an admin? - " + Boolean.toString(isUserAnAdmin));

		if ((!isUsernameTaken && isUsernameLongEnough) || isUserAnAdmin)
		{
			System.out.println("You can use that username!");
		}
		else
		{
			System.out.println("Sorry, that username is taken!");	
		}
	}
}