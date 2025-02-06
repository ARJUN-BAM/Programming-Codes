import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
		int num = new Scanner(System.in).nextInt();
		int temp = num/2;
		System.out.println((num-(2*temp))==0);
	}
}