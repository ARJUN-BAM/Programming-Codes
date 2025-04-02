import java.util.Scanner;
class StatVar 
{
	static double d;//100000//1.0001E8
	static
	{
		d = test(100);
		System.out.println(d); // 100000
		d = test(d) + demo((int)d); 
		double d = demo((int)test(StatVar.d));
		System.out.println(d);
	}
	public static void main(String [] args)
	{
		System.out.println(d);
		System.out.println(test(d));
		System.out.println((int)demo((int)d));
	}
	public static double test(double num)
	{
		return num*num;
	}
	public static char demo(int num)
	{
		return (char)num;
	}

}