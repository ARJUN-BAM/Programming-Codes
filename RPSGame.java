class RPSGame
{
	public static void main(String [] args)
	{
		for(int i =0 ; i<100;i++)
		{
			int num = (int)(Math.random()*10)%3;
			System.out.print(num + " ");
		}
	}
}