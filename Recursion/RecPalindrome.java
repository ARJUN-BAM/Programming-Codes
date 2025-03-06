import java.util.Scanner;
class RecPalindrome 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(reverseNum(num,num,0));
	}
	public static boolean reverseNum(int num,int temp,int rev)
	{
		if(num==0)
			return temp==rev;
		else
			return reverseNum(num/10,temp,(rev=rev*10+num%10));
	}
}