class CLA
{
	public static void main(String[] args)
	{
		if(args.length>1)
		{
			System.out.println(args[0]);
			/*for(int i = 0; i<args.length;i++)
			{
				System.out.println(args[i]);
			}*/
		}
		else
		{
			System.out.println("No arguments");
		}
	}
}