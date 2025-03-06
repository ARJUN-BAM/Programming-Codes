import java.util.Scanner;
class RecReverse 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(reverseNum(num,0));
	}
	public static int reverseNum(int num,int rev)
	{
		if(num==0)
			return rev;
		else
			return reverseNum(num/10,temp,(rev=rev*10+num%10));
	}
}