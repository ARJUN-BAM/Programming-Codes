import java.util.Scanner;
class NumToWord
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		String word = "";
		while(num>0)
		{
			int rem = num%10;
			switch(rem)
			{
				case 0: 
					word = "ZERO "+word;
					break;
				case 1: 
					word = "ONE "+word;
					break;
				case 2: 
					word = "TWO "+word;
					break;
				case 3: 
					word = "THREE "+word;
					break;
				case 4: 
					word = "FOUR "+word;
					break;
				case 5: 
					word = "FIVE "+word;
					break;
				case 6: 
					word = "SIX "+word;
					break;
				case 7: 
					word = "SEVEN "+word;
					break;
				case 8: 
					word = "EIGHT "+word;
					break;
				case 9: 
					word = "NINE "+word;
					break;
				default: 
					System.out.println("Wrong Input Other than digit");
					System.exit(0);
				
			}
			num/=10;
		}
		System.out.println(word); 
	}
}