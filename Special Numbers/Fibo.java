import java.util.Scanner;
class Fibo 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		int temp=0;
		for(int i = 0;i<num;i++)
		{
			temp = n2;//1 2
			System.out.println(n1+n2);//1 2 3
			n2 += n1;//2 3
			n1 = temp;//1 2
		}
	}
}
// 0 1 1 2 3 5 8 13