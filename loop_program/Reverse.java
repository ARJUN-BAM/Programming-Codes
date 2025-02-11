import java.util.Scanner;
class Reverse
{
	public static void main(String [] args)
	{
		System.out.print("Enter a number :");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		while(dup>0)
		{
			int rem = dup%10;
			rev=rev*10+rem;
			dup/=10;
		}
		System.out.println(num+ "'s reverse is "+rev);
		if(num==rev)
		{
			System.out.println("It's a palindrom number");
		}
	}
}