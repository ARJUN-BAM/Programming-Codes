import java.util.Scanner;
class Pattern9 
{
	public static void main(String [] args)
	{
		int eDiff = 7;
		int oDiff = -2;
		for(int i=1;i<=4;i++)
		{
			System.out.print(i+" ");
			int t = i;
			for(int j=2;j<=i;j++)
			{
				if(j%2==0)
					t+=eDiff;
				else
					t+=oDiff;
				System.out.print((t)+" ");
			}
			System.out.println();
			eDiff-=2;
			oDiff+=2;
		}
	}
}

/*


1
2 7
3 6 8
4 5 9 10


*/