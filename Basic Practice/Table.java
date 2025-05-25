import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Enter a Range : ");
		int range = sc.nextInt();
		for(int i=0;i<=range;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}
		