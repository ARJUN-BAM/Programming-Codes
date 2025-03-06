import java.util.Scanner;
class Pronicc 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(proNic(num,0));
	}
	public static boolean proNic(int n,int i )
	{
		if(i*(i+1)>n)
			return false;
		else if(i*(i+1)==n)
		{
			System.out.println(i+" "+(i+1));
			return true;
		}
		else
			return proNic(n,++i);
	}
}