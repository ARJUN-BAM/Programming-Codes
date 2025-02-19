import java.util.Scanner;
class DuckNumber 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		String num = sc.next();
		if(!(num.charAt(0)=='0') && num.contains("0") )
		{
			System.out.print("Duck Number");
		}
		else{
			System.out.print("Not a Duck Number");
		}
	}
}