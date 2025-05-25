import java.util.Scanner;
class Yearcal
{
	public static void main(String[] args)
	{
		System.out.print("Enter the total number of minutes : ");
		long minutes = new Scanner(System.in).nextLong();
		long years = minutes/(365*24*60);
		long days = (minutes%(365*24*60))/(24*60);
		System.out.println("Years : "+years + " & Days : " + days); 
	}
 }