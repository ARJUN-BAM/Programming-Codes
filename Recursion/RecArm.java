import java.util.Scanner;
class RecArm 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		System.out.println(isArmstrong(num,num,0));
	}
	public static boolean isArmstrong(int num,int temp,int sum)
	{
			return num==0? temp==sum: isArmstrong(num/10,temp,sum+=powerNum(num%10,count(temp,0)));//use count(num,0) for checking if the number is disarium number.
			//return num==0? temp==sum: isArmstrong(num/10,temp,sum+=powerNum(num%10,count(num,0)));
	}
	public static int powerNum(int num,int range)
	{
		return range==0?1:num*powerNum(num,--range);
		
	}
	public static int count(int num,int cnt)
	{
		return num==0?cnt:count(num/10,++cnt);
	}
}