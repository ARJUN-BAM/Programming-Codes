class Hockey
{
	public static void main(String[] args) {
		String num = "01101101111110";
		int cnt = 0;
		outer :
		for(int i = 0;i<num.length();i++)
		{
			if(num.charAt(i)=='0')
			{
				int n = 0;
				while(n<7&&(i+n)<=num.length())
				{
					if(num.charAt(n+i)=='0')
						n++;
					else
					{
						i=n-1;
						continue outer;
					}
				}
			
				if(n==7)
				{
					System.out.println("dengerous");
					System.exit(0);
				}
				else{
					i=n-1;
					continue outer;
				}
			}
			else if(num.charAt(i)=='1')
			{
				int n = 0;
				while(n<7&&(i+n)<=num.length()){
					if(num.charAt(n+i)=='1')
						n++;
					else
						{i=n-1;
							continue outer;}
				}
				if(n==7)
				{
					System.out.println("dengerous");
					System.exit(0);
				}
				else{
					i=n-1;
					continue outer;
				}
			}


		}
		System.out.println("NOt dengerous");
					
	}
}
