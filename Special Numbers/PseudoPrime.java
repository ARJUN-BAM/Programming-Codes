import java.util.Scanner;
class PseudoPrime 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		double num = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.println(isPesudo(num,num2));
	}
	public static boolean isPesudo(double num,double temp)
	{
		if(isPrime(num,2))
			return false;
		else
		{
			System.out.println(powNum(temp,num-1)+" % "+num+" = "+(int)(powNum(temp,num-1)%num));
			if((int)(powNum(temp,num-1)%num)==1){
				return true;
			}
			else{
				return false;
			}
		}
	}
	public static double powNum(double num,double range)
	{
		if(range==1)
			return num;
		else
			return num*powNum(num,--range);
	}
	public static boolean isPrime(double num, double temp)
	{
		if(num==temp)
			return true;
		else if(num%temp==0)
			return false;
		else
			return isPrime(num,++temp);
	}
}