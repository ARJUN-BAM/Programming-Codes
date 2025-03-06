import java.util.Scanner;
class Emirp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int dup=num;
		int rev = 0;
		boolean flag = false;
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				System.out.println("Number is not a Emirp");
				System.exit(0);
			}
			else if(i==(num/2)&&flag==false)
			{
				for(int j=num;j>0;j/=10)
				{
					rev=rev*10+(j%10);
				}
				if(rev==dup)
				{
					System.out.println("Number is not a Emirp");
					System.exit(0);
				}else{
					num=rev;
					flag = true;
					i=2;
				}
				
			}
		}
		System.out.println("It is a Emirp Number");
		
		
	}
}