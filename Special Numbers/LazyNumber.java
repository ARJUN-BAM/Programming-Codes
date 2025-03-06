import java.util.Scanner;
class LazyNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		Islazy(num);
	}
	public static void Islazy(int num)
	{
		int sum = 1;
		int i = 1;
		do{
			System.out.println(sum);
			sum+=i;
			i++;
		}while(i<=num);
	}
}