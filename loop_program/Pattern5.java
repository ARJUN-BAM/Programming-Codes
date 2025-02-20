import java.util.Scanner;
class Pattern5 
{
	public static void main(String [] args)
	{
		int num = 3;
		for(int i = 0;i<num;i++)
		{
			for(int j = 0;j<num-i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j = 0;j<=i;j++)
			{
				if(j==0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j = 1;j<=i;j++)
			{
				if(i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i = num-1-1;i>=0;i--)
		{
			for(int j = 0;j<num-i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j = 0;j<=i;j++)
			{
				if(j==0||i==num-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j = 1;j<=i;j++)
			{
				if(i==num-1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		// for(int i = num-1;i>=0;i--)
		// {
		// 	for(int j = 0;j<num-i-1;j++)
		// 	{
		// 		System.out.print("  ");
		// 	}
		// 	for(int j = 0;j<=i;j++)
		// 	{
		// 		if(j==0||i==num-1||j==i)
		// 			System.out.print("* ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }
		// for(int i = num-1;i>=0;i--)
		// {
		// 	for(int j = 0;j<num-i;j++)
		// 	{
		// 		System.out.print("  ");
		// 	}
		// 	for(int j = 0;j<=i;j++)
		// 	{
		// 		if(j==0||i==num-1||j==i)
		// 			System.out.print("* ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }

		// for(int i = num-1;i>=0;i--)
		// {
		// 	// for(int j = 0;j<num-i;j++)
		// 	// {
		// 	// 	System.out.print("  ");
		// 	// }
		// 	for(int j = 0;j<=i;j++)
		// 	{
		// 		if(j==0||i==num-1||j==i)
		// 			System.out.print("* ");
		// 		else
		// 			System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }
	}
}