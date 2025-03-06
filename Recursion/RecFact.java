import java.util.Scanner;
class RecFact 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(Fact(num));
	}
	public static int Fact(int num)
	{
		if(num==0)
			return 1;
		else
			return num*Fact(--num);
	}
}