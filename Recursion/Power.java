import java.util.Scanner;
class Power 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println("Power of Number : "+powerNum(num,3));
	}
	public static int powerNum(int num,int range)
	{
		if(range==0)
			return 1;
		else
			return num*powerNum(num,--range);
	}
}