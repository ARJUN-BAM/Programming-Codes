import java.util.Scanner;
class AlphaDigit
{
	public static void main(String[] args) {
		System.out.print("Enter String :");

		String s = new Scanner(System.in).next().toUpperCase();
		int sum = (int)(s.charAt(0)-64);
		int temp =26;
		for(int i=1;i<s.length();i++)
		{
			sum = sum*26+(int)(s.charAt(i)-64);
		}
		System.out.println(sum);
	}
}