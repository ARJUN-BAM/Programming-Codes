import java.util.Scanner;
class Weather
{
	public static void main(String[] args)
	{
		String month = new Scanner(System.in).next().toUpperCase();
						System.out.println((month.equals("FEB")||month.equals("MAR")||month.equals("APR")||month.equals("MAY"))?("It is Summer"):((month.equals("OCT")||month.equals("NOV")||month.equals("DEC")||month.equals("JAN"))?("It is Winter"):((month.equals("JUN")||month.equals("JUL")||month.equals("AUG")||month.equals("SEP")?("Its is monsoon"):("Invalid Input")))));
						
	}
}