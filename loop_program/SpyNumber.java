import java.util.Scanner;
class SpyNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int prod = 1;
		for(int i = num;i>0;i/=10)
		{
			int rem = i%10;
			sum+=rem;
			prod*=rem;
		}
		if(sum==prod)
			System.out.print("Spy Number");
		else{
			System.out.print("Not a Spy Number");
		}
	}
}
