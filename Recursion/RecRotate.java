import java.util.Scanner;
class RecRotate 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		rotateNumber(num,num);
	}

	public static void rotateNumber(int num,int temp)
	{
		num = (num%10)*powerNum(10,Count(num/10,0))+(num/10);
		System.out.println(num);
		if(num!=temp)
			rotateNumber(num,temp);
		else
			return;
	}
	public static int powerNum(int num,int range)
	{
		return range==0?1:num*powerNum(num,--range);
		
	}
	public static int Count(int num,int cnt)
	{
		return num==0?cnt:Count(num/10,++cnt);
	}
}