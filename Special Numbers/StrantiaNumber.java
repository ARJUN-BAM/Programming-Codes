import java.util.Scanner;
class StrantiaNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);//4225
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(isStrant(num));
	}
	public static boolean isStrant(int num)
	{
		num *= 2;
		if((num/10)%10==(num/100)%10)
			return true;
		else
			return false;
	}
}