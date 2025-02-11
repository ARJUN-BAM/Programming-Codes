package loop_program;
import java.util.Scanner;
class OddLoop
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number to find odd : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println("1. EVEN");
		System.out.println("2. ODD");
		System.out.print("Enter your Option : ");
		switch(new Scanner(System.in).nextInt())
		{

			case 1 :
				for(int i = 2; i<=num ; i+=2)
				{
					System.out.print(i + " ");
				}
				System.out.println();
				break;
				
			case 2 :
				for(int i = 1; i<=num ; i+=2)
				{
					System.out.print(i + " ");
				}
				System.out.println();
				break;
			default :
				System.out.println("Invalid Input");
				break;

		}
		
	}
}