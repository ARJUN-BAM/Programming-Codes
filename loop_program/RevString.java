import java.util.Scanner;
class RevString
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string : ");
		String s = new Scanner(System.in).next();
		int i = s.length()-1;
		String s1="";
		while(i>=0)
		{
			s1+=(i==0)?((char)(s.charAt(i)+32)):((i==(s.length()-1)))?((char)(s.charAt(i)-32)):(s.charAt(i));
			i--;
		}
		System.out.println(s+" : "+s1);
		if(s.equals(s1))
		{
			System.out.println("It is a Palindrom String");
		}
	}
}
