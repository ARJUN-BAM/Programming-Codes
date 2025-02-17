import java.util.Scanner;
class Pattern2 
{
	public static void main(String [] args)
	{
		int num = 0;
		for(int i =0;i<4;i++)
		{
			num+=i+1;
			int k = num;
			for(int j = 0; j <= i ; j++)
			{
				System.out.print((num--)+ " ");
			}
			num = k;
			System.out.println();
		}
	}
}



/*
1
3 2
6 5 4
10 9 8 7



*/