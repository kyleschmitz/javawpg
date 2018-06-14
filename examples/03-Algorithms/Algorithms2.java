public class Algorithms2
{
	public static void main(String[] args)
	{
		int usersAllowedToVote = 0;
		int[] userAges = {17, 20, 31, 12, 40, 62, 8, 18};


		for (int i = 0; i< userAges.length; i++)
		{
			if (userAges[i] >= 18)
			{
				usersAllowedToVote++;
			}
		}

		System.out.println("There are " + usersAllowedToVote + " users allowed to vote.");
	}
}