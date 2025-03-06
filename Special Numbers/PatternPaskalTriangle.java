import java.util.Scanner;
class PatternPaskalTriangle 
{
	public static void main(String [] args)
	{
		printTra(10);
	}
	public static void printTra(int n)
	{
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<=n-1-i;j++)
				System.out.print(" ");
			for(int j = 0;j<=i;j++)
			{
				int comb = fact(i)/(fact(j)*(fact(i-j)));
				System.out.print(comb+" ");
			}
			System.out.println();
		}
	}
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}