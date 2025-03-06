import java.util.Scanner;
class MagicNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(isMagic(num,sumOfDigit(num,0)));
	}
	public static boolean isMagic(int num,int sum)
	{
		if(sum==1)
			return true;
		else if(sum==num||sum<10) //can also use exception handling for stackoverflow
			return false;
		else{
			// try{
			 return isMagic(num,sumOfDigit(sum,0)); 
			// }
			// catch(StackOverflowError e)
			// {
			// 	return false;
			// }
		}
	}
	public static int sumOfDigit(int num,int sum)
	{
		if(num==0)
			return sum;
		else
			return sumOfDigit(num/10,sum+=num%10);
	}
}