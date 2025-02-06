import java.util.Scanner;
class Varbal
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Character : ");
		char ch = new Scanner(System.in).next().charAt(0);	System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?(ch + " is a vowel alphabet"):(ch + " is not a vowel alphabet"));
	}
}