import java.util.Scanner;
class Neon 
{
	public static void main(String [] args)
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a Number : ");
		// int num = sc.nextInt();
		for(int k=0;k<=100000000;k++)
		{
			int sqr = k*k;
			int sum=0;
			for(int i=sqr;i>0;i/=10)
			{
				sum+=(i%10);		
			}
			if(sum==k)
				System.out.print(k+" ");
			//System.out.println((sum==num)?("Neon"):("Not Neon"));
		}
	}
}