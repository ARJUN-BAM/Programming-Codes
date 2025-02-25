import java.util.Scanner;
class Pattern6 
{
	public static void main(String [] args)
	{
	
		for(int i = 1;i<=5;i++)
		{
			int t =i;
			int temp = 4;
			for(int j =1;j<=i;j++)
			{
				System.out.print((t)+" ");
				t+=(temp--);
			}			
			
			System.out.println();
		}
	}
}



/*
1
2 6 
3 7 10
4 8 11 13 
5 9 12 14 15
*/