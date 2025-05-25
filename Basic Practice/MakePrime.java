import java.util.Scanner;
class Makeprime
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number:");
		int num = new Scanner(System.in).nextInt();
		if(num==1)
		{
			System.out.println("the num "+num+" is Prime ");
			System.exit(0);
		}
		for(int i =2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				num++;
				i=2;
			}
		}
		
		System.out.println("the num "+num+" is Prime ");
	}
}