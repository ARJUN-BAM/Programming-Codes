import java.util.Scanner;
class Automorphic 
{
	public static void main(String [] args)
	{
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a Number : ");
		// int num = sc.nextInt();
		for(int k=1;k<=1000;k++)
		{int len = 0,div=0;
			for(int i = k;i>0;i/=10)
					len++;
			div=(int)Math.pow(10,len);
			if(k==((k*k)%div))
			System.out.println(k+" Automorphic");
		}
	}
}


