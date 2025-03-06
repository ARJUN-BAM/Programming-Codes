import java.util.Scanner;
class RecCount 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(Count(num,0 ));
	}
	public static int Count(int num,int cnt)
	{
		if(num==0)
			return cnt;
		else
		{
			return Count(num/10,++cnt);
		}
	}
}