//Dhruvkumar Patel
//CSC 162-02
//Lab 5 - Program 1

public class NorthEastPath
{
	public static void main(String[]args)
	{
		String str = " ";
		System.out.println("Number of paths are: " + noOfPaths(0,1,3,2));
		northEastPath(0,1,3,2,str);

	}
	public static void northEastPath(int x1, int y1, int x2, int y2, String str)
	{
		 if (x1 == x2 && y1==y2)
		 {
		    System.out.println(str);
		 }

		String strF = str+"E";
	 	if (x1 < x2)
	 	{
			 northEastPath(x1+1, y1, x2, y2, strF);
	 	}

		strF = str+"N";
	    if(y1 < y2)
	    {
		     northEastPath(x1, y1+1, x2, y2, strF);
	    }


    }
    public static int noOfPaths(int x1, int y1, int x2, int y2)
    {
			if (x1 > x2 || y1 > y2)
			return 0;

			if (x1 == x2 && y1 == y2)
			return 0;

			if (x1 == x2 - 1 && y1== y2)
			return 1;

			if (x1 == x2 && y1 == y2 - 1)
			return 1;

		    int p1 = noOfPaths(x1+1,y1,x2,y2);
			int p2 = noOfPaths(x1,y1+1,x2,y2);
			return p1+p2;
		}
	}