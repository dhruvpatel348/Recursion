//Dhruvkumar Patel
//CSC 162-02
//Lab 5 - Program 2

public class StarPattern
{
	public static void main(String[]args)
	{
		step(8,0);
	}

	public static void step(int n,int k)
	{
		if(n==0) return;

		step(n/2,k);

		for(int indx = 0; indx<k;indx++)
		{
			System.out.print("  ");
		}

		for(int indx = 0; indx<n;indx++)
		{
			System.out.print("* ");
		}
			System.out.println();

			step(n/2,k + n/2);
	}
}

/*This star pattern is a fractal as it recursively subdivided in parts,
each of which is a reduced size copy of the whole. In this pattern we are using small part of pattern to
extend it as a whole new patterns which is a cluster of small parts of this pattern.*/