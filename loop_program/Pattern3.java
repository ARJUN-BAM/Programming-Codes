// import java.util.Scanner;
class Pattern3 
{
	public static void main(String [] args)
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a Number : ");
		int num = 3;

		// for(int i = num-1;i>=0;i--)
		// {
		// 	for(int j = 0;j<num-i;j++)
		// 	{
		// 		System.out.print("* ");
		// 	}
		// 	for(int j = 0;j<=i;j++)
		// 	{
		// 		System.out.print("  ");
		// 	}
		// 	System.out.println();
		// }






		for(int i = 0; i<num ; i++)
		{
			for(int j = 0 ; j<num-i;j++)
				System.out.print("  ");
			for(int j = 0 ; j<=i;j++)
				System.out.print("* ");
			for(int j = 0 ; j<i;j++)
				System.out.print("* ");
			// for(int j = num-i ; j>=0;j--)
			// 	System.out.print("  ");
			
			System.out.println();
		}
		for(int i = num-1-1; i>=0 ; i--)
		{
			for(int j = 0 ; j<num-i;j++)
				System.out.print("  ");
			for(int j = 0 ; j<i;j++)
				System.out.print("* ");
			for(int j = i ; j>=0;j--)
				System.out.print("* ");
			// for(int j = 0 ; j<=i;j++)
			// 	System.out.print("  ");
			System.out.println();
		}


		
	}
}