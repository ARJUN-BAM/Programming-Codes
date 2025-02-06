class Swapnum
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		System.out.print("Before swapping : ");
		System.out.println("a : " + a + " b : "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("After swapping : ");
		System.out.println("a : " + a + " b : "+ b);
	}
}