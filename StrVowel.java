import java.util.Scanner;
class StrVowel
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.print("Enter a String : ");
		String str = new Scanner(System.in).next().toUpperCase();
		for(int i= 0 ; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')		
			{
				System.out.print(ch+" ");
				Thread.sleep(1000);
			}
		}
	}
}
e