import java.util.Scanner;
class Emirp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int dup=num;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is not a Emirp");
				System.exit(0);
			}
		}
		int rev = 0;
		for(int i=num;i>0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		if(rev==dup)
		{
			System.out.println("Number is not a Emirp");
			System.exit(0);
		}

		for(int i=2;i<=(rev/2);i++)
		{
			if(rev%i==0)
			{
				System.out.println("Number is not a Emirp");
				System.exit(0);
			}
		}
		System.out.println("It is a Emirp Number");
	}
}