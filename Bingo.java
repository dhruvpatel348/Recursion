//Dhruvkumar Patel
//CSC 162-02
//Lab 5 - Program 3
public class Bingo
{
	static String name = "BINGO";

	public static void main(String[]args)
	{
		printLyrics(0);
	}
	public static void printLyrics(int clap)
	{
		if(clap>name.length())return;
		System.out.println("Verse" + (clap+1) + ": There was a farmer had a dog,");

		System.out.println("And Bingo was his name-O");

		for(int indx = 0; indx<3;indx++)
		{
			for(int indx1 = 0; indx1<clap;indx1++)
			{
				System.out.print((indx1==0 ? "(":"")+"clap"+(indx1==clap-1 ? (clap == name.length() ? ")" : ")-") : ","));
			}

			for(int indx2 = clap;indx2<name.length();indx2++)
			{
				System.out.print(name.charAt(indx2) + (indx2 == name.length() - 1 ? "!" : "-"));
			}
			System.out.println();
		}

		System.out.println("And Bingo was his name\n");

		printLyrics(clap+1);
	}
}