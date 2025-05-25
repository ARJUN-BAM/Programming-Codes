import java.util.Scanner;
class HiNum
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println((num%2==0)?((num%5==0)?("HiTwoHiFive"):("HiTwo")):((num%5==0)?("HiFive"):("")));	
	}
}