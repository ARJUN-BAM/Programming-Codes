import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		for(int i = 0;i*i<=(num+1);i++)
		{
			if(i*i==(num+1))
				{System.out.print("SunnyNumber");
				System.exit(0);}
			else
				continue;
		}
		System.out.print("Not a SunnyNumber");
	}
}