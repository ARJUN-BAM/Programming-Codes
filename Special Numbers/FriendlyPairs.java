import java.util.Scanner;
class FriendlyPairs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int bNum = ((num1>num2)?num1/2:num2/2);
		int factsum1=0,factsum2=0;
		if(bNum==num1/2)
		{
			factsum1 = num1;
		}
		else
		{
			factsum2 = num2;
		}
		for(int i=1; i<=bNum;i++)
		{
			if(num1%i==0)
			{
				factsum1+=i;	
			}
			if(num2%i==0)
			{
				factsum2+=i;	
			}
		}
		System.out.println(((factsum1/num1)==(factsum2/num2))?(num1+" & "+num2+" is a friendly pairs"):(num1+" & "+num2+" is not a friendly pair"));
	}
}
		