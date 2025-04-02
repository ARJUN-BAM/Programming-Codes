import java.util.Scanner;
class Goldbach 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		numGold(num);
	}
	public static void numGold(int num)
	{
		int start = 2;
		int end = nextPrimeRev(num);
		while(end>start)
		{
			if((start+end)==num){
				System.out.println(start + " "+end);
				start = nextPrime(start);
				end = nextPrimeRev(end);
			}
			else if((start+end)>num)
				end = nextPrimeRev(end);
			else
				start = nextPrime(start);
		}
	}
	public static int nextPrime(int num)
	{
		do
		{
			num++;
		}while(!isPrime(num));
		return num;
	}
	public static int nextPrimeRev(int num)
	{
		if(num==2)
			return num;
		do
		{
			num--;
		}while(!isPrime(num)&&num>1);
		return num;
	}
	public static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		for(int i = 2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}