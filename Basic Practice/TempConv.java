import java.util.Scanner;
class TempConv
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number[Celcius] : ");
		float temp = s.nextFloat();
		System.out.println("1. Fahrenheit");
		System.out.println("2. Kelvin");
		System.out.println("Choose option for convertion : ");
		int ch = s.nextInt();
		float ctemp;
		switch(ch)
		{
			case 1: ctemp = temp*(9/5f)+32;
				System.out.println(temp+" Degree Celcius is "+ctemp+"Degree Fahrenheit.");
				break;
			case 2: ctemp = temp+273.15f;
				System.out.println(temp+" Degree Celcius is "+ctemp+"Degree Kelvin.");
				break;
			default : System.out.println("Wrong Input");break;
				
		}
	}
}