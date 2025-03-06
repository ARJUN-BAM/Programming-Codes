import java.util.Scanner;
class RecPrime 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(isPrime(num,2));
	}
	public static boolean isPrime(int num,int temp)
	{
		if(num==temp)
			return true;
		else if(num%temp==0)
			return false;
		return isPrime(num,++temp);
	}
}