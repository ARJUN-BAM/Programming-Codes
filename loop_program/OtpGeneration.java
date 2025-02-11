import java.util.Scanner;
class OtpGeneration
{
	public static void main(String[] args)
	{
		System.out.print("Enter a Number : ");
		int num = new Scanner(System.in).nextInt();
		String s = "";
		for(int i = 0;i<num;)
		{
			s += (Math.random()*100000);
			if(s.length()==6)
			{
				System.out.println(s);
				i++;
			}
			s="";
		}
	}
} 