import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Character : ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println((ch>=65&&ch<=90||ch>=97&&ch<=122)?((ch>=97&&ch<=122)?(ch + " is a Lower Case Alphabet"):(ch + " is an Upper Case Alphabet")):((ch>=48&&ch<=57)?(ch + " is a digit"):(ch + " is a special character")));
	}
}